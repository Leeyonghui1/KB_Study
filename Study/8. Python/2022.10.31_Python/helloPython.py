print("Hello World")

a = 10
a = "bac"

if a == "bac":
    print("a는 bac이다.")
elif a == 10:
    print("a는 10이다.")
else:
    print("이도저도아니다.")

i = 0
a = 10
while i < a:
    print(i)
    i += 1

for item in range(1, 11, 1):
    print(item)

mydata = []
mydata.append(10)
mydata.append(20)
mydata.insert(1, 15)
for item in mydata:
    print(item)

# 주석 표시
"""
여러줄 주석은 큰 따옴표 3개
"""