# < 12/7 수업내용 >

# 출력 - print()
# 입력 - input()
# 변수 - num=10 그냥 타입없이 변수만
# 타입변환 - str() 문자열, int(), float()실수
# 출력포맷 - print("{0}".format(10)), print("{0}  {1}".format(10, "변수정"))

# 문제 1.
# 시속 v k/h로 달리고 있는 자동차가 반지름 r km인 원형트랙을 달리고 있다면
# 한바퀴 완주하는데 걸리는 시간은 몇분인가? 소수점 한자리까지 출력
# 자동차 속도와 반지름을 입력하여 구하기

# 둘레 = 반지름 * 2파이 
# 거리 = 속력*시간
# 시간 = 거리/속도
"""
v = float(input("속도입력 : "))
r = float(input("반지름 : "))
dist = r*2*3.14 #트랙길이
time = dist/v *60
print("완주시간{0}".format(time)) # print("완주시간 : " str(time))

# 문제2.
# 소주 한잔에 수명이 2분 단축된다.
# 지연이가 소주를 20년동안 마셨다.
# 그렇다면 지연이는 수명이 총 몇 분 줄었는가?
# 총 몇시간 줄었는가?
# 총 며칠?
# 하루에 소주를 몇잔 마시는지 입력하여 세가지 구하여 출력

소주 = int(input("소주 몇잔? "))
life = 소주*2*365*20
print("김지연 단축 수명 : {0}분".format(life))
print("김지연 단축 수명 : {0}시간".format(life/60))
print("김지연 단축 수명 : {0}일".format(life/60/24))

 
# 파이썬은 변수를 한줄로 표현할 수 있다. 
x,y,z = "김지연", "장영주", "변수정"
a=b=c="연하남친"
favorite=["목발","선인장","19남친"] # 리스트
a,b,c = favorite
print(a)
print(b)
print(c)

# 같다 -> == , 같지 않다 -> != , >  <  >=  =<

num=19
num1=27

if num1 > num :
    print("누나 내 여자이니까!")
else :
    print("누나 늙었어...")
# else라인과 같으면 출력 안됨 
# 파이썬은 라인 잘 맞춰야 한다    
print("여기는 그냥 출력")

if(num1>num) :
    print("연하가 좋앙")

age=22

# 파이썬에서 else if = elif
if age> num :
    print("내가 형이니깐 내가 가지겠어 누나!")
elif num > age :
    print("내가 더 연하야!")
else :
    print("둘다 싫어! 난 이제 연상 좋아")


name="김지연"
# 한줄로 표현할 경우
print("미안합니다.. 그만할게요") if name=="김지연" else print("농일세") if num1!=27 else print("뻥인데 계속할껀데")

# 문제 3.
# 지연이와 기원이가 오락실에 갔다
# 둘이 오붓하게 펀치 게임을 하였다.
# 지연이와 기원이의 펀치 점수가 각각 얼마인지 입력하여 누가 이겼는지 출력하시오

김지연=int(input("김지연 점수 : "))
김기원=int(input("김기원 점수 : "))

if 김지연>김기원 :
    print("김지연 승리")
elif 김지연<김기원 :
    print("김기원 승리")
else:
    print("무승부")


# 문제 4.
# 영주하고 지연이하고 수정이가
# 시험을 봤다. 세명의 시험점수를 입력하고 세명의 등급이 어떻게 되는지 출력하기
# 90점 이상은 A , 80점 이상은 B, 70점 이상은 C, 나머지 점수는 '쯧쯧...' 출력하기

장영주=int(input("장영주 점수 : "))
김지연=int(input("김지연 점수 : "))
변수정=int(input("변수정 점수 : "))

sum = 장영주+김지연+변수정
avg = sum/3

if avg >=90: #90점 이상이면
    grade = "A" 
elif avg >=80:
    grade = "B"
elif avg >=70:
    grade = "C"
else:
    grade = "쯧쯧..."
 
print(grade) #grade변수 출력

# 1~10 까지 출력하기
i=1
while i<=10:
    print(i)
    i += 1

# 구구단 4단 출력 해보세요
# 4 * 1 = 4 -> 이렇게 출력하기
i = 1
while i<=9:
    print("4 * {0} = {1}".format(i, 4*i))
    # print("4 * "+str(i)+" = "+str(4*1))
    i += 1


i=1
while i<5:
    print(i)
    i+=1
else:
    print("5보다 크면 반복문 종료돼")

# 1~100 출력하기
i=1
while True:
    print(i)
    if i==100:break
    i+=1

# while문 마지막 문제
# 배꼽지연이가 연하남친을 만나려고 교통카드를 10000원 충전하였다.
# 지연이가 버스를 몇번 탈수 있는가? 잔액은 얼마인가?
# 버스요금은 1200원
# 반드시 while문을 사용할 것

# 쌤 답안
지연데이트카드 = 10000
버스비=1200
탑승=0

while 지연데이트카드 >= 버스비 :
    지연데이트카드 -= 버스비
    탑승 += 1
else :
    print("잔액 : {0}, 탑승 횟수 : {1} ".format(지연데이트카드, 탑승))

# 내가 푼 답
cash = 10000
count = 0

while cash >= 1200 :  # while True :
    cash -= 1200
    count +=1 
    if cash < 1200 :
        break
        
print('탑승 횟수는 : {0}, 잔액은 : {1}'.format(count, cash))


# for문
for i in range(10):  # 반복 횟수 넣어주기 
    print(i)

for i in range(1, 10):  # (시작값, 종료값) 
    print(i)

for i in range(1, 10, 3):  # (시작값, 종료값, 증가값) 1분터 10까지 3씩 증가해라 
    print(i)


# 구구단 8단 출력하기
for i in range(1, 10):
    print("8 * {0} = {1}".format(i, 8*i))
    # print("8 * "+str(i)+" = "+str(8*1))

# 45부터 109까지 출력하시오
for i in range(45, 110):
    print(i)

# < 12/8 수업내용 >

# 1부터 100까지 출력하는데
# 3의 배수에서는 윤재영 출력
# 5의 배수에서는 바보 출력

# 쌤 답안
for i in range(1, 101):
    if i%3==0:
        print("윤재영" ,end=" ") # ,end="" : 줄바꿈없이 출력
    if i%5==0:
        print("바보")    

# 내가 푼 답
for i in range(1, 101):
    if (i%3==0):
        print("윤재영")
    elif (i%5==0):
        print("바보")
    elif (i%15==0):
        print("윤재영 바보")


# 파이썬 데이터 타입
# 리스트, 튜플, 딕셔너리, 셋, 배열

# 리스트 : [ ] 대괄호 사용, 배열과 같이 사용, 익덱스로도 표현 가능
name = [ "장영주바보", "김지연똥개", "윤재영멍충이" ]
print( name )
data1 = ["김기원장", 100, 3.14, True]
print( data1 )

data2 = list(("최윤도서관", "변수정과", 100))
print( data2 )

print( data2[0] )
print( data2[-1] )

data3 = [ "이종빈티지", "윤종찬양하라", "이지현미밥맛있어", "장영주모"]
print( data3[1:3] ) #2번~3번 인덱스까지 출력
print( data3[:3] ) # 0번~3번 인덱스까지 출력
print( data3[2:] ) # 3번~4번 인덱스까지 출력

data3.append("김지연기하네")
data3.append("윤재영영사랑해")
print( data3 )

data3.remove("장영주모") # 실 데이터를 통해 삭제
print( data3 )
data3.pop() # 마지막 데이터 삭제
print( data3 )
del data3[2] # 인덱스를 통해 삭제
print( data3 )

data3.clear() # 리스트 완전 삭제
print( data3 )


memo = ["나 ", "김지연","은" ," 19세 남친을", " 원한다"]
for me in memo:
    print( me, end="" )

memo[3] = "30세 남친을"
for me in memo:
    print( me, end="" )

memo[1:4] = ["장영주","는"," 목발을 "]
print()
for me in memo:
    print(me, end="" )

memo.insert(3," 드러운 어그와 ") # 추가
print(memo)

memo1 = ["이종빈", "윤재영", "변수정"]
memo2 = ["장영주부", "  김지연세많음", " 이지현왕언니"]
memo1.extend(memo2) # 확장
print(memo1)

print( len(memo1) ) # len :  리스트가 몇개인지 알 수 있음


# 리스트 생성
# 1. memo = ["a", "b", "c"]
# 2. memo = list(("장","영","주","땡"))
# 데이터 추가 memo.append("리정수")
# 데이터 삽입 memo.insert(2, "김민정수리")
# 데이터 삭제
# 삭제데이터 지정 memo.remove("땡")
# 마지막데이터삭제 memo.pop()
# 인덱스로 삭제 del memo[3]
# 리스트 합치기 memo.extend(리스트)
# 리스트 크기 len()
# 갯수 구하기 memo.count("장") - 장 이라는 데이터가 몇개 있냐?
# 인덱스 찾기 memo.index("영") - 영 이라는 데이트는 몇번 인덱스냐?
# 정렬 memo.sort() - 오름차순, memo.sort(reverse=True) - 내림차순
# 반전 memo.reverse()

info501 = ["장영주는 폭력적이다.", "김지연은 연하만 좋아한다.", " 윤재영은 옆반쌤 좋아한다"
            "최윤도는 영주불행이 행복이다." ,"수정이는 생일이라 코딩이 싫데...", "종빈이는 지금 게임한다."]

# 501호 딸기반 학생 이름을 input으로 입력 받기
# info501에 해당 학생 이름이 있다면 학생의 정보를 출력하시오
student = input("딸기반 학생 이름을 입력 : ")
for info in info501:
    if student in info : # info 안에 student가 있냐
        print(info)

# 문제2. info501에서 좋아한다 문구가 있는 정보들 모두 출력
word = "좋아한다"
for info in info501:
    if word in info :
        print(info)
"""
num = [x for x in range(10)]
print(num)
