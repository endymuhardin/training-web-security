## Password Storage ##

Bedakan antara:
* encode : transformasi bentuk supaya mudah di transport. Contoh : mengirim file mp3 atau jpeg dalam attachment/upload
* encrypt : dua arah. plain -> encrypted -> plain
* hash : satu arah. plain -> hashed

Best practices menyimpan password:

* Hash, jangan encrypt, apalagi encode
* Pilih algoritma hash yang lambat/butuh resource besar. Gunakan bcrypt atau scrypt, jangan SHA apalagi MD5
* Gunakan salt. Salt bisa otomatis diambil dari username. Contoh: Spring Security menyimpan password => bcrypt(password)

Best practices dalam reset password :

* https://www.troyhunt.com/everything-you-ever-wanted-to-know/
