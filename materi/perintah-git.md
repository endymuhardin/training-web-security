# Perintah Git Sehari-hari #

1. Setup pertama kali

    ```
    git config --global user.name "Endy Muhardin"
    git config --global user.email "endy@muhardin.com"
    ```

2. Mengambil repo dari server (pertama kali saja)

    ```
    git clone <url>
    git clone https://github.com/endymuhardin/training-web-security.git
    ```

3. Menambahkan file/perubahan untuk disimpan ke repo

    ```
    git add namafile
    git add .
    ```

4. Menyimpan perubahan yang sudah di-add ke repo

    ```
    git commit -m "keterangan perubahan"
    ```

5. Upload repo lokal ke repo remote

    ```
    git push
    ```
