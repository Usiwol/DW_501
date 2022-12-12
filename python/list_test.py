x=9
print("output: " +str(x))
print("output:{0}".format(x))

a=3.14
print("float:{0}".format(a))
print("float:{0:.1f}".format(a))

print(type(a))

name="김민정"
print("이름:{0:s}".format(name))
print("이름:"+name)
memo="을 이정수가 때렸다."

result = name+memo
print(result)
res_len = len(result) #len : 문자길이
print(res_len)

temp1=result.split()
print(temp1)
temp2=result.split(" ",1)
print(temp2)

print("{0}".format(",".join(temp1)))
#join : 문자열배열을 합치기 "%".join(배열) 하면 각배열의 요소사이에 %가 붙은 상태로 합쳐진다.
"""  이것도 주석으로 사용하기도 함 """

num=int(input("숫자를입력하세요: ")) #input은 입력함수이다. 결과는 문자열로 반환한다.
print(type(num))

# 정수타입변환 int()
# 실수타입변환 float()
# 문자열 타입 변환 str()

""" 문제1. 국어,수학,영어 세과목 점수 입력받아서 평균을 구햐여 출력하기 """
# 쌤답안
국어=int(input("국어 점수 : "))
수학=int(input("수학 점수 : "))
영어=int(input("영어 점수 : "))

total = 국어+수학+영어
평균 = total/3
print("평균 : {0}".format(평균))

# 내가 푼 답안
# num1=int(input("국어 점수 : "))
# num2=int(input("수학 점수 : "))
# num3=int(input("영어 점수 : "))
# result=input((num1+num2+num3)/3)
# print(type(result))