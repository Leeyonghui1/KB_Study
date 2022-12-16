import xml.etree.ElementTree as elemTree
import pymysql

tree = elemTree.parse('data3.xml')
# data 태그를 찾고 그 안에 있는 item 태그들을 모두 data 변수에 넣음
data = tree.find('./data').findall('item')

xml_arr = []
xml_dictionary = {}  # 자바스크립트의 객체, 파이썬에서는 딕셔너리라고 부름

for item in data:
    xml_dictionary['연번'] = item.find('./col[@name="연번"]').text
    try:
        xml_dictionary['서명'] = item.find('./col[@name="서명"]').text
    except:
        xml_dictionary['서명'] = ''
    xml_dictionary['가격'] = item.find('./col[@name="가격"]').text
    xml_arr.append(xml_dictionary)
    xml_dictionary = {}  # 초기화

conn = pymysql.connect(host='localhost', user='root', password='1234', db='myprojectdb', charset='utf8')
sql = 'insert into book values(%d, "%s", %d)'
cur = conn.cursor()

for item in xml_arr:
    cur.execute(sql % ( ((int)(item['연번']))+4000, item['서명'], (int)(item['가격']) ))

conn.commit()
conn.close()