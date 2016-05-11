# Instalasi Damn Vulnerable Web Application #

## Instalasi XAMPP ##

1. Set executable `chmod +x xampp<tab>`
2. Jalankan installer `sudo ./xampp<tab>`
3. Next next sampai selesai

## Instalasi DVWA ##

1. Unzip dvwa.zip
2. Copy hasil extract ke /opt/lampp/htdocs
3. Rename jadi dvwa supaya mudah diakses
4. Set permission supaya bisa dihack 

	```
     chmod o+w /opt/lampp/htdocs/dvwa/hackable/uploads/
     chmod o+w /opt/lampp/htdocs/dvwa/external/phpids/0.6/lib/IDS/tmp/phpids_log.txt
     ```

5. Edit konfigurasi php di `/opt/lampp/etc/php.ini` set `allow_url_include=On`
6. Restart Apache Server lewat console XAMPP
7. Edit `/opt/lampp/htdocs/dvwa/config/config.inc.php`

	```
	$_DVWA[ 'recaptcha_public_key' ]  = '6LdK7xITAAzzAAJQTfL7fu6I-0aPl8KHHieAT_yJg';
	$_DVWA[ 'recaptcha_private_key' ] = '6LdK7xITAzzAAL_uw9YXVUOPoIHPZLfw2K1n5NVQ';
	```