'''
# 함수
# 자바의 메서드
# 반환타입 메서드이름(매개변수) { 메서드 실행내용;  반환타입있다면 return; }
# 자바스크립트 함수
# function 함수이름(매개변수) { 함수 실행내용;  반환타입있다면 return; }

# 파이썬 함수
# def 함수이름(매개변수):

# 정의된 함수 실행 방법 -> 함수이름()

def sum(a,b):
    return a+b # 함수를 먼저 실행해두고 변수 넣기

res = sum(10,20)
print(res)

def func():
    print("나 함수다")

func() # 매개변수를 가지지 않은 함수

def func1(word): # 매개변수를 가진 함수
    print(word+"이다")

func1("난 천재")

def minus(num1, num2):
    print(num1-num2)

minus(30,15)

def whoami(name, what):
    if name=="장영주":
        print(name+"는(은) "+what+"이다.")
    else:
        print(name+"는(은) "+what+"가 아니다.")

whoami("장영주","귀요미")
whoami("김지연","못난이")

def count(i):
    return i+1

cnt=0
while cnt<10:
    cnt = count(cnt)

print(cnt)

cnt1=0

def count2():
    global cnt1 # 파이썬의 전역변수 - count2 함수에서 cnt1을 사용하고자 한다면 global 붙여서
                # 전역변수임을 알려주고 사용한다.
                # 전역변수는 최소함으로만 사용 - 코드의 유지보수를 어렵게 한다.
                # 전역변수를 마구 생성하여 사용하면 정신적인 데미지를 입는다.
    cnt1+=1

while cnt1<10:
    count2()
print(cnt1)

# 그러면 여기서 문제 간단한 거로다가
# 간단한 문제 풀기 그 첫번째
# 갓난애기도 풀 수 있을지도 모르는 문제1.
# 정수 하나를 입력받아서 함수를 통해 해당 정수의 값을 100증가 시키고 출력하기

def add100(n): #100이 증가하는 함수 정의 지정된 값 100증가해야 되니까 매개변수 필요
    print(n+100) # 100 증가시키고 출력하기

num=int(input("정수 입력 : ")) #정수 입력받기
add100(num) # 100증가 시켜주는 함수 호출하여 입력받은 숫자를 함수에 넘겨주기


# 첫번째 할것. 정수 두개 입력받기(변수 두개해서 입력받기)
# 두번째 할것. 정수 입력받는 코드 위에 함수만들기
#             함수의 내용은 두숫자를 곱해서 출력하는 내용
# 세번째 할것. 정수 입력받는 코드 밑에 함수 호출하기

# 쌤 정답 == 내가 풀은 답 (오예)
def multi(a,b):
    print(a*b)

num1=int(input("정수 입력 : "))
num2=int(input("정수 입력 : "))

multi(num1, num2)

# 첫번째. 리스트만들기
# 두번째. 리스트에 1~50까지 짝수만 저장하기
# 세번째. 리스트 만들기 코드 위에 함수 만들기
#         함수내용은 함수에 입력된 숫자에 +1 해서 출력하기
# 네번째. 리스트를 반복문 이용하여 함수 호출하기, 함수에 리스트값 입력

# 쌤 정답
def add1(n):
    print(n+1) # 입력된 숫자에 +1 해서 출력하기

li =[i for i in range(1,50) if i%2==0] # 리스트에 1~50까지 짝수만 저장하기

for i in li:
    add1(i)


# 세과목 점수를 입력받아서 총점과 평균을 구할 것이다.

def score_input(s):
    scr=[] # 함수내부에서 입력한 점수를 리스트에 저장해야 하기에 리스트 만든 것 함수 것이다.
    for sub in range(len(s)):
        scr.append(int(input(s[sub])))
    return scr #for문으로 입력한 점수가 저장된 리스트 scr을 돌려 보내야 한다.
    # 그래야 실 사용하고자 하는 곳에서 값을 사용하니까

def total(점수들): #총점 계산하기용 함수
    tot=0
    for i in 점수들 : tot += i     #입력한 점수 전부 더하기
    return tot

def avg(총점): #평균 계산하기용 함수
    평균 = 총점/3
    print("총점 : {0}, 평균 : {1}".format(총점,평균))

score=[] # 입력한 점수를 가지고 있음
subj=("국어 점수","영어 점수","물리치료")

score = score_input(subj) #튜플로 만든 subj를 함수에 보낸다. subj의 주소를 보내는 것
tot = total(score)
avg(tot)


# 장영순, 김지언, 이지형의 키를 입력하여 평균키를 구하시오
# 평균 키보다 작은 사람 누구인지 출력하기
# 키입력하는 함수
# 평균키 계산하는 함수
# 작은키 누구야? 함수

# 쌤의 정답 (리턴하지 않고 하는 방식)
def small(avg, tall, 소녀들):
    for i in range(len(tall)):
        if avg > tall[i]:
            print("평균 보다 작은 사람 : {0}".format(소녀들[i]))

def tall_avg(tall, 소녀들):
    sum=0
    for 소녀키 in tall: sum += 소녀키
    avg = sum/len(tall)
    print("평균 키는 : "+str(avg))
    small(avg, tall, 소녀들)

def tall_input(소녀들):
    tall=[]
    for 소녀 in 소녀들:
        tall.append(int(input(소녀)))
    tall_avg(tall, 소녀들)


cuterirls = ("장영순","김지언","이지형")
tall_input(cuterirls)    


# 쌤의 정답 2
cuterirls = ("장영순","김지언","이지형") # 전역 튜플

def small(avg, tall):
    global cuterirls    #전역 튜플을 사용하기 위해 global을 해준다
    for i in range(len(tall)):
        if avg > tall[i]:
            print("평균 보다 작은 사람 : {0}".format(cuterirls[i]))

def tall_avg(tall):
    sum=0
    for 소녀키 in tall: sum += 소녀키
    avg = sum/len(tall)
    print("평균 키는 : "+str(avg))
    small(avg, tall)

def tall_input():
    global cuterirls    #전역 튜플을 사용하기 위해 global을 해준다
    tall=[]
    for 소녀 in cuterirls:
        tall.append(int(input(소녀)))
    tall_avg(tall)

tall_input()    

# 나의 오답
# def height_input(h):
#     scr=[]
#     for hei in range(len(h)):
#         scr.append(int(input(h[hei])))
#     return scr

# def avg(total):
#     tot=0
#     for i in height : tot += i
#     return tot
    
#     평균=합계/3
#     print("합계 : {0}, 평균 : {1}".format(합계, 평균))

# height=[]
# name=("장영순","김지언","이지형")


# height = height_input(name)
# tot = total(height)
# avg(tot)
''' 

# 간단한거 해보기
# 리스트에 1부터 50까지 저장하기
# 리스트에 저장되어 있는 숫자들 중에서 5의 배수만 출력하기
# 5의 배수를 찾아서 출력하는 함수 만들어서 하기

# 쌤답안
import random


def output(li):
    for num in li:
        if num%5==0:
            print(num)

li = [i for i in range(1,51)]
output(li)
 
# # 내가 풀다 만 답안
# def list_input(li):

# li=[]
# for i in range(1,51):
#     li.append(i)
#     print(li)

#================================

def func(a,b,c): 
    print(a)

func(a="abc", b="b", c="c")

#================================

def func1(national="계림국"): #매개변수에 기본값 지정 가능
    print(national)

func1("대한민국")
func1()

#================================

def func2(**info):
    print(info["name"])
    print(info["상태"])

func2(name="장영주", 상태="천재,아름다움,귀여움")

# 첫번째 리스트에는 이순신,장영실,정몽주,정도전,이방지의 키를 입력
# 두번째 리스트에는 이순신,장영실,정몽주,정도전,이방지의 몸무게를 입력
# 키가 가장작은 사람 찾는 함수
# 몸무게가 가장 높은 사람 찾는 함수

# 쌤답안

옛사람 = ("이순신","장영실","정몽주","정도전","이성계","이방지")

def small_tall(tall):
    global 옛사람
    sm=tall[0]  #0인덱스의 키가 가장 작든 크든 아무상관없음, 비교값이 필요하니 넣어준거
    for i in range(len(tall)): # 키가 가장작은 키 찾기
        if sm > tall[i]:
            sm = tall[i]
    print("키가 작은 사람 : {0}".format(옛사람[tall.index(sm)]))

def high_wd(wd):
    global 옛사람
    hg=wd[0]
    for i in range(len(wd)):
        if hg < wd[i]:
            hg = wd[i]
    print("몸무게가 가장 높은 사람 : {0}".format(옛사람[wd.index(hg)]))


tall = [random.randint(157,184) for i in range(6)]
wd = [random.randint(61,87) for i in range(6)]

small_tall(tall)
high_wd(wd)

#print(tall)


# # 내가 풀다 만 답안
# def small():
#     smallest=0
#     for i in range(len(hei)):
#         if  i < smallest :
#             print("키가 작은 사람 : {0}".format([i]))

# def heavy():
#     heavist=0
#     for i in range(len(wei)):
#         if i < heavist :
#             print("몸무게 높은 사람 : {0}".format([i]))
            
# history=("이순신","장영실","정몽주","정도전","이방지")
# hei=[]
# wei=[]

# for i in history:
#     hei.append(int(input(i+" 키 : ")))
#     wei.append(int(input(i+" 몸무게 : ")))

# print(small)
# print(heavy)

