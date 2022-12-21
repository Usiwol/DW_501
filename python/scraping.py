
# HTTP - 하이퍼텍스트(html)을 전송하기 위한 프로토콜
#       - HTML과 JS와 CSS같은 파일을 웹 서버에게 요청하고 받아오는 프로토콜
# 프로토콜 - 약속, 규약  
# url - http://www.naver.com
# uri - url에 사용자 정보와 스키마를 포함한 값

# 스크래핑 - 웹페이지에서 자동으로 데이터를 추출하는 것, 웹페이지 소유자의 허락없이 무단으로 끌어오는 행위
# 크롤링 - 웹페이지에서 자동으로 데이터 추출
# 스크래핑은 특정 웹사이트에서 데이터 추출, 크롤링은 웹사이트의 링크를 통해서 정보를 찾아서 추출하는 방식
# 둘다 데이터 추출한다라는 것이 동일하기에 흔히 크롤링이라고 한다.

# 하씽 - 원하는 데이터만 뽑아서 쓰느것

from urllib.request import urlopen
import bs4

# test_html = "<html><head></head><body><div>hahahahaha</div>"
# test_html +=" <p>jgr babo</body></html>"

# bobj = bs4.BeautifulSoup(test_html, "html.parser")

# print(test_html)
# print(bobj)

# print(test_html.find("div")) #출력 : 26
# print(bobj.find("div")) #출력 : <div>hahahahaha</div>
# print(bobj.find("p")) #출력 : <p>jgr babo</p>

# url="http://www.naver.com"
# html=urlopen(url)

# print(html.read())

# html = """
# <html>
#     <body>
#         <div>
#             <ul class="kjy">
#                 <li>cutigirl</li>
#                 <li>goodgirl</li>
#             </ul>
#             <ul class="ljh">
#                 <li>cute</li>
#                 <li>beautiful</li>
#             </ul>
#         </div>
#     </body>
# </html>
# """

# bsp = bs4.BeautifulSoup(html, "html.parser")

#태그의 속성을 통해서 가져오는 방법
# ul = bsp.find("ul",{"class":"ljh"})
# print(ul['class'])  #ul태그의 class명만 가져옴
 
# ul = bsp.find("ul",{"class":"ljh"})   #class가 ljh인 ul을 가져옴
# print(ul) 

# ul = bsp.find("ul")   #첫번째 ul만 가져옴
# print(ul) 

#li = bsp.find("li")
# print(li.text)
# li = bsp.findAll("li")    #모든 li태그를 가져옴
# print(li[1])

# #li 모두 가져오기
# for i in li:
#     print(i.text)


url = "https://www.naver.com"
html = urlopen(url)
html = html.read()

bsp = bs4.BeautifulSoup(html, "html.parser")
temp = bsp.findAll("strong",{"class","current"})
print(temp[0].text)    #현지기온만 추출하기
for t in temp:
    if "현재기온" in t:
        print(t.text)