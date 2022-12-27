import requests
import bs4
import urllib
from urllib.request import urlopen
import pymysql

conn = pymysql.connect(host='127.0.0.1', user='root' , password='06251003',
db='dw_501',charset='utf8')
#데이터베이스 연결후에 커서생성, 커서는 파이썬과 DB 사이를 연결해주는 드라이버의형태

url = "https://weather.naver.com/today/0740102?cpName=KMA"
html = urlopen(url)

bsp = bs4.BeautifulSoup(html, "html.parser")

weather_div = bsp.findAll("div",{"class","card_weather_graph"})
