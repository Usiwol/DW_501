
# 미니 시험

# (c:/test 폴더에 member.txt) txt 문서에 다음과 같은 형태로 데이터 20개 작성하기
# 번호 이름 연락처 이메일 성별 주소(동,읍,면까지만 입력)

# 위 txt 파일을 읽어 오기
# 딕셔너리에 저장하기(key, value  알아서)
# 1. 이메일의 도메인 몇개이고 무엇무엇 있는지 출력하기(중복없이) - 도메인은 naver.com, google.com 요런거
# 2. naver.com  도메인의 이메일을 사용하는 사람들이 사는 도시이름만 출력하기
# 3. 성별이 여자인 사람중에서 대전 중구에 사는 사람은 누구인가? 모두출력

# 함수
# - 파일 읽기 함수
# - 파일 읽어서 딕셔너리에 저장하는 함수
# - 1. 함수 - 이메일에서 도메인 분리하는 함수, 중복제거하고 출력하는 함수
# - 2. naver.com인 사람 찾는 함수
# - 3. 성별로 찾는 함수 (꼭 여자만 찾을 수 있으면 안됨, 남자를 찾고 싶으면 ckw기기 되어야 한다, 코드 수정없이)

# 성별로 찾는 함수
def findFemaleUser(file):
    for num in file:
        if "여"==(file[num]['성별']):
            if "대전광역시중구"==(file[num]['주소(읍,면,동까지만)'][:7]):
                print(file[num])

# naver.com인 사람 찾는 함수
def findNaverUser(file):
    for num in file:
        if "naver.com"==(file[num]['이메일'].split("@"))[1]:
            print(file[num]["주소(읍,면,동까지만)"][:5])

# 중복제거하고 출력하는 함수
def removeDuplication(email):
    tempSet=set(email)
    print("몇 개 : {0}, 종류 : {1}".format(len(tempSet),tempSet))

#이메일에서 도메인 분리하는 함수
def selectDomain(file):
    email = [file[num]["이메일"] for num in file]
    domain = []
    for num in email:
        domain.append((num.split("@"))[1])
    removeDuplication(domain) 


# 파일 읽어서 딕셔너리에 저장하는 함수
def saveFile(file):
    key = ["번호", "이름", "연락처", "이메일", "성별", "주소(읍,면,동까지만)"]
    dictFile = dict()
    for f in range(len(file)):
        dictFile[f+1] = dict(zip(key, file[f]))
    for k in dictFile:
        print("{0}".format(dictFile[k]))
    selectDomain(dictFile)
    findNaverUser(dictFile)
    findFemaleUser(dictFile)


# 파일 읽기 함수
def readFile():
    file=[]
    with open("c:/test/member.txt","r",encoding="utf-8") as f:
        file=f.readlines()

    for i in range(len(file)):
        file[i] = file[i][:len(file[i])-1] # 문자열 슬라이싱 "banana"[2:]->"nana","banana"[2:4]->"na" # "banana"[:4]->"bana"
        file[i] = file[i].split(" ")
    print(file)
    saveFile(file)

readFile()

