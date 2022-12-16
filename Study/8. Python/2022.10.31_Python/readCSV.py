import csv
import pymysql

f = open("data.csv", 'r', encoding='utf-8')
rdr = csv.reader(f)
"""
for item in rdr:
    # [] 안의 숫자는 csv 파일에서 컬럼을 지정하는 숫자
    # print(item)
    # print(item[0])
    temp = '책제목:{}, 출판사:{}'.format(item[1], item[2])
    print(temp)
    print("----")
"""
count = 0
mydata = []
for line in rdr:
    if count == 0:   # 첫번째 줄 그냥 통과
        pass         # continue랑 다르게 밑 명령문 수행함
    else:
        mydata.append(line)   # 첫 번째 줄 제외 모든 데이터 넣음
    count += 1

for item in mydata:
    print(item)

# 파일 관련 객체 종료
f.close()

# 밑에 터미널에서 pip install PyMySQL 입력하고 설치한 후 sql연결코드 적어야함
sql = 'insert into book values(%d, "%s", %d)'
for item in mydata:
    conn = pymysql.connect(host='localhost',
                           user='root',
                           password='1234',
                           db='myprojectdb',
                           charset='utf8')
    with conn:  #db 연결 및 끊어주는 걸 자동으로 함. db명령수행하면 자동끊김
        with conn.cursor() as cur:
            cur.execute(
                sql % (int(item[0]), item[1], (int)(item[6].strip().replace(",", "")))
            )
            conn.commit()
