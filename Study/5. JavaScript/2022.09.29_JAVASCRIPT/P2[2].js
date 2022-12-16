$
(
    function()
    {
        // 모든 코드를 한 번에 변경하는 단축키 : ctrl+F2
        const name = $('#name')
        const gender = $('#gender')
        const beonho = $('#beonho')

        const print = $('#print')
        const reset = $('#reset')
        const printOrderBy = $('#printOrderBy')
        const information = $('#information')

        function resetInfo()
        {
            // infomation 안에 있는 내용을 날리는것
            information.html('')
        }

        reset.on('click',function()
        {
            resetInfo()
            students = []  // P2.js에 있는 배열
        })

        print.on('click',function()
        {   // val = value :: input태그의 value
            const student = new Student(name.val(),gender.val(),Number(beonho.val()))

            let newStudentInfo = $('<h1></h1>')
            newStudentInfo.text(student.toString())
            if(student.gender == '남')
            {
                newStudentInfo
                .css('background-color','springgreen')
                .css('color','blue')
            }
            else
            {
                newStudentInfo
                .css('background-color','black')
                .css('color','pink')
            }
            information.append(newStudentInfo)
        })

        printOrderBy.on('click',function()
        {   
            // 중복체크 로직
            const idx = students.findIndex(function(item)
            {
                return item.beonho === Number(beonho.val())
            })
            if(idx != -1) // 입력한 번호가 이미 있는 경우
            {
                alert('중복!')
                return
            }
            resetInfo() // 화면 리셋
            // 새로운 값 추가
            students.push(new Student(name.val(),gender.val(),Number(beonho.val())))
            // 정렬(객체 정렬할 때도 sort 사용)
            students.sort(function(a,b)
            {
                return a.beonho - b.beonho
            })
            // 정렬된 것을 print
            for(let i = 0 ; i < students.length ; i++)
            {
        
                let newStudentInfo = $('<h1></h1>')
                newStudentInfo.text(students[i].toString())
                if(students[i].gender == '남')
                {
                    newStudentInfo
                    .css('background-color','springgreen')
                    .css('color','blue')
                }
                else
                {
                    newStudentInfo
                    .css('background-color','black')
                    .css('color','pink')
                }
                information.append(newStudentInfo)
            }
        })
    }
)