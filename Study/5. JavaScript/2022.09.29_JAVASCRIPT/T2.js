// P2[2].js 의 jQ문법을 js문법으로 바꾸기
window.onload = function()
{
    // const name = $('#name')
    const name = document.querySelector('#name')
    // const gender = $('#gender')
    const gender = document.querySelector('#gender')
    // const beonho = $('#beonho')
    const beonho = document.querySelector('#beonho')
    
    // const print = $('#print')
    const print = document.querySelector('#print')
    // const reset = $('#reset')
    const reset = document.querySelector('#reset')
    // const printOrderBy = $('#printOrderBy')
    const printOrderBy = document.querySelector('#printOrderBy')
    // const information = $('#information')
    const information = document.querySelector('#information')
    
    function resetInfo()
    {
        // information.html('')
        information.innerHTML = ''
    }
    
    /*
    reset.on('click',function()
    {
        resetInfo()
        students = [] 
    })*/
    reset.addEventListener('click',function()
    {
        resetInfo()
        students = []
    })
    
    /*
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
    })*/
    print.addEventListener('click',function()
    {
        const student = new Student(name.value,gender.value,Number(beonho.value))
        let newStudentInfo = document.createElement('h1')
        newStudentInfo.textContent = student.toString()
        if(student.gender == '남')
        {
            newStudentInfo.style.background = 'springgreen'
            newStudentInfo.style.color = 'blue'
        }
        else
        {
            newStudentInfo.style.background = 'black'
            newStudentInfo.style.color = 'pink'
        }
        information.appendChild(newStudentInfo)
    })
    
    /*
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
    })*/
    printOrderBy.addEventListener('click',function()
    {
        const idx = students.findIndex(function(item)
        {
            return item.beonho === Number(beonho.value)
        })
        if(idx != -1) 
        {
            alert('중복!')
            return
        }
        resetInfo()
        students.push(new Student(name.value,gender.value,Number(beonho.value)))
        students.sort(function(a,b)
        {
            return a.beonho - b.beonho
        })
        for(let i = 0 ; i < students.length ; i++)
        {
            let newStudentInfo = document.createElement('h1')
            newStudentInfo.textContent = students[i].toString()
            if(students[i].gender == '남')
            {
                newStudentInfo.style.background = 'springgreen'
                newStudentInfo.style.color = 'blue'
            }
            else
            {
                newStudentInfo.style.background = 'black'
                newStudentInfo.style.color = 'pink'
            }
            information.appendChild(newStudentInfo)
        }
    })

}
