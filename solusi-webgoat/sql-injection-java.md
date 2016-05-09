```java
public class DemoServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res){
		// menggunakan input dari user apa adanya
		String nama = req.getParameter("account_name");
		String sql = "select * FROM user_data ";
		sql += "WHERE last_name = '" + nama + "'";

		Statement st = connection.createStatement(sql);
		ResultSet rs = st.executeQuery();
    }
}
```

```sql
select * from user_data where last_name = 'endy';
select * from user_data
select * from user_data where last_name = 'whatever' or '1'='1'
```


Solusi :
* whitelisting character : tentukan karakter yang valid
* framework/fitur bahasa pemrograman : PreparedStatement

Query : `select * from user_data where last_name = 'endy';`
1. Kirim ke database
2. Validasi sintaks
3. Compile query
4. Buat query plan : strategi membuka tabel
5. Jalankan query
6. Kirim result

Prepared Statement
Query : `select * from user_data where last_name = ?`
Pertama kali
1. Kirim ke database
2. Validasi sintaks
3. Compile query
4. Buat query plan : strategi membuka tabel
5. Jalankan query
6. Kirim result

Berikutnya:
1. Isi parameter
2. Jalankan query
3. Result

```java
PreparedStatement ps = conn.prepareStatement(sql);
select * from user_data where last_name = ? --> 10101001000101?111010
ps.setString(1, nama);
1010101101010010010whatever' or '1'='10100101

ResultSet rs = ps.executeQuery();

public class UserDao{
  public void cariUser(){
    PreparedStatement ps = conn.prepareStatement(sql);
  }
}
```