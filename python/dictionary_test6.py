
'''
# 딕셔너리 - 사전
# 파이썬 딕셔너리, 자바에서는 Map
# key : value

dic = {'이름':'이순신', '나이':24, '직업':'군인'}
print(dic)
print(dic['이름'])
# 키로 사용가능 - 문자열, 정수, 실수, 불(True, False)
# 키 사용불가 - 리스트, set, 딕셔너리
# value 사용 - 아무거나 다

dic = {} # 이거는 set 아니고 딕셔너리로 인식
dic = dict() # 딕셔너리 생성

dic1 = dict(이름='김지연', 나이=29, 직업='마이쥬판매원')
print(dic1)

dic2 = dict([('이름','이지현'), ('age',26),('특징','알면서')])
print(dic2)

dic3 = dict(zip(['이름','나이','관심분야'],['윤재영',25,'컴퓨터선생님']))
print(dic3)

print(dic3['이름'])
dic3['관심분야']='지연이누나'
print(dic3)

dic3['싫어하는것'] = '옆반선생님'
print(dic3)

if '이름' in dic3:
    print("너의 이름은 : {0}".format(dic3['이름']))
else:
    print("존재하지 않는 키입니다.")

#딕셔너리 몇개?
print(len(dic3))

title = ["캐릭터명","생명력","코딩기술","잔머리","수학능력","공간능력","지능지수"]
data = []
for x in title:
    data.append(input(x+" : "))

# print(data)

info = dict(zip(title,data))
print(info)

for x in info:
    print(x) # 딕셔너리의 키 출력

for x in info:
    print(info[x]) #딕셔너리의 value 출력

for x in info.values:
    print(x) #딕셔너리의 value 출력

for x in info.keys:
    print(x) #딕셔너리의 key 출력

for k, v in info.items:
    print(k,v) #딕셔너리의 key,value 출력


title = ["이름","키","몸무게","관심분야"]

# 5명의 정보를 입력한다.
info=[]
for i in range(5):
    data=[]
    for t in title:
        data.append(input(t+" : "))
    info.append(data)

# 이름을 키로 사용하여 딕셔너리에 5명의 정보를 저장하시오.

dic_info = dict()
for data in info:
    dic_info[data[0]] = dict(zip(title,data))

print(dic_info)

# 문제 1.
# 이름,번호,c언어성적,java성적,react성적,DB성적,지적수준
# 3명의 성적을 딕셔너리에 저장하시오

# 쌤답안
keys=["이름","번호","c언어성적","java성적","react성적","DB성적","지적수준"]
values=list() # 입력한 값을 리스트에 저장하고 그 리스트를 저장할 리스트
for i in range(3):
    temp=list() #입력한 값이 저장될 리스트
    for k in keys: #한명에 대한 정보 입력 for문
        temp.append(input(k))
    values.append(temp)

class501 = dict()
for v in values:
    class501[v[0]]=dict(zip(keys,v)) #딕셔너리 이름을 key, 모든데이트를 value

for k in class501: #딕셔너리 출력하기
    print("{0} : {1}".format(k,class501[k]))


#나의 오답
data=[]

for i in range(10):
    data=[]
    for z in title:
        data.append(input(z+" : "))
    data.append(data)

dic_data = dict()
for info in data:
    dic_data[data[2],data[3],data[4],data[5]] = dict(zip(title,data[]))
    👉👉 딕셔너리에는 key를 하나만 넣을수 있다.  dic_data[키] -> [ 안에는 키를 넣어야한다. (하나만)]
    딕셔너리에는 키는 중복될 수 없다.

print(dic_data)


# 문제 2.
# 위 내용을 토대로 입력한 성적들의 평균 점수(지적수준 빼고)를 구하여
# 이름은 key, valuee는 평균점수와 지적수준을 딕셔너리에 저장

# 첫번째 방식
# avg = list()
# dic_avg=dict()
# for name in class501: # name에는 키로 사용한 이름이 저장
#     sum=0
#     for title in class501[name]: # title에는 이름, 번호, 성적들,
#         if title=="이름" or title =="번호" or title=="지적수준":
#             continue
#         sum = sum + int(class501[name][title]) # 한명의 성적 총합 구하기
    
#     dic_avg[name] =  dict(평균점수=sum/4, 지적수준=class501[name]['지적수준'])

# print(dic_avg)

#두번째 방식
avg = list()
dic_avg=dict()
for name in class501: #name에는 키로 사용한 이름이 저장
    sum=0
    #values 값으로 가져올 때
    score = list(class501[name].values())
    for i in range(2,6): # 2~5까지 불러옴
        sum = sum + int(score[i])

    #keys 값으로 가져올 때
    # title=list(class501[name].keys()) #딕셔너리의 키를 리스트로 변환
    # for i in range(2,6): # 2~5까지 불러옴
    #     sum = sum + int(class501[name][title[i]])
    
    dic_avg[name] =  dict(평균점수=sum/4, 지적수준=class501[name]['지적수준'])

print(dic_avg)

# 👉 이론 내용
# 딕셔너리의 key만 리스트로 변환
# li = list(dic.keys())
# 딕셔너리의 value만 리스트로 변환
# li = list(dic.values())
# 딕셔너리의 key, value를 리스트로 변환
# li = list(dic.items())
# key와 value를 한쌍으로 튜플형태로 저장
#[('k1' : 'v1'), ('k2' : 'v')]
'''

# 문제 3.
# 문의제목, 작성자, 문의내용, 작성일, 답변, 답변일
# 딕셔너리에 저장하는데 키는 번호를 사용, 파일에서 읽어드린 순서대로 1번부터 부여

# f = open("c:/test/question.txt","r",encoding="utf-8") #쓰기 - w, 읽기- r, 추가-a

file=[]
with open("c:/test/question.txt","r",encoding="utf-8") as f:
    file=f.readlines()

for i in range(len(file)):
    file[i] = file[i][:len(file[i])-1] # 문자열 슬라이싱 "banana"[2:]->"nana","banana"[2:4]->"na"
                                    # "banana"[:4]->"bana"
                                    #  -1 하는 이유 : \n  지우기 위해서
    file[i] = file[i].split(" ") # 띄어쓰기 기준으로 불러오기

key = ["문의제목", "작성자", "문의내용", "작성일", "답변", "답변일"]

qus=dict() # 딕셔너리 생성
for i in range(len(file)): 
    qus[i+1] = dict(zip(key, file[i])) # 딕셔너리 안에 key랑 value값을 저장

# print(qus)

# 문제
# 문의 목록을 출력하시오.(번호와 제목, 작성일만 출력)
# 작성자 또는 제품명으로 검색하여 해당 문의글의 전체 출력하기
# 출력예시
# 작성자 : 윤재명
# 제목 : 출마선언합니다.
# 작성일 : 2027-03-10
# 문의글 : 대선출정하고싶습니다.도와주세요.
# ============================================
# 답변 : 1억 있어요?
# 답변일 : 2027-02-05

# 자바 DB에서 데이터 가져올 때 select 블라블라
# rs.pt 블라블라;
# rs.getInt("번호")
# rs.getString("문의제목")
# rs.getString("작성자")
# 컬럼명 입력해서 가져온다

for num in qus:
    print("{0}. {1} {2}".format(num,qus[num]["문의제목"], qus[num]["작성일"]))

번호 = int(input("문의 번호 : "))

print("\n작성자 : {0}\n제목 : {1}".format(qus[번호]['작성자'],qus[번호]['문의제목']))
print("작성일 : {0}\n문의글 : {1}".format(qus[번호]['작성일'],qus[번호]['문의내용']))
print("============================================")
print("답변 : {0}\n답변일 : {1}\n".format(qus[번호]['답변'],qus[번호]['답변일']))


