package jdbccrudoperation.dao;
import java.io.Closeable;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import jdbccrudoperation.pojo.Book;
import jdbccrudoperation.utils.DBUtils;

public class BookDao implements Closeable {
	private Connection con;
	private CallableStatement insertStatement;
	private CallableStatement updateStatement;
	private CallableStatement deleteStatement;
	private CallableStatement selectStatement;
	public BookDao()throws Exception {
		this.con = DBUtils.getConnection();
		this.insertStatement = this.con.prepareCall("{call sp_insert_books(?,?,?,?,?)}");
		this.updateStatement = this.con.prepareCall("{call sp_update_books(?,?)}");
		this.deleteStatement = this.con.prepareCall("{call sp_delete_books(?)}");
		this.selectStatement = this.con.prepareCall("{call sp_select_books()}");
		}
	public int insert(Book book) throws Exception{
		this.insertStatement.setInt(1, book.getBookId());
		this.insertStatement.setString(2, book.getSubjectName());
		this.insertStatement.setString(3, book.getBookName());
		this.insertStatement.setString(4, book.getAuthorName());
		this.insertStatement.setFloat(5, book.getPrice());
		this.insertStatement.execute();
		return this.insertStatement.getUpdateCount();
	}
	public int update(int bookId, float price)throws Exception{
		this.updateStatement.setFloat(1, price);
		this.updateStatement.setInt(2, bookId);
		this.updateStatement.execute();
		return this.updateStatement.getUpdateCount();
		
	}
	public int delete(int bookId)throws Exception {
		this.deleteStatement.setInt(1, bookId);
		this.deleteStatement.execute();
		return this.deleteStatement.getUpdateCount();
		}
	public List<Book> getBooks() throws Exception{
		this.selectStatement.execute();
		List<Book> books = new ArrayList<>();
		try(ResultSet rs = this.selectStatement.getResultSet()){
			while(rs.next()) {
				Book book = new Book(rs.getInt("book_id"), rs.getString("subject_name"), rs.getString("book_name"), rs.getString("author_name"), rs.getFloat("price"));
				books.add(book);
			}
			
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		return books;
	}
	@Override
	public void close() throws IOException {
		try {
		this.con.close();
		this.insertStatement.close();
		this.updateStatement.close();
		this.deleteStatement.close();
		this.selectStatement.close();
		}catch(SQLException ex) {
			throw new IOException(ex);
		}
	}
}
