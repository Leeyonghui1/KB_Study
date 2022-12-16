document.addEventListener('DOMContentLoaded',function()
{
    const name = document.getElementById('name')
    const gender = document.getElementById('gender')
    const beonho = document.getElementById('beonho')
    
    const print = document.getElementById('print')
    const reset = document.getElementById('reset')
    const printOrderBy = document.getElementById('printOrderBy')
    const information = document.getElementById('information')
    
    function resetInfo()
    {
        information.innerHTML = ''
    }

    reset.addEventListener('click',function()
    {
        resetInfo()
        students = []
    })

    print.addEventListener('click',function()
    {   
        const student = new Student(name.value,gender.value,Number(beonho.value))
    
        let newStudentInfo = document.createElement('h1')
        newStudentInfo.textContent = student.toString()
        if(student.gender == '남')
        {
            newStudentInfo.style.backgroundColor = 'springgreen'
            newStudentInfo.style.color = 'blue'
        }
        else
        {
            newStudentInfo.style.backgroundColor = 'black'
            newStudentInfo.style.color = 'pink'
        }
        information.appendChild(newStudentInfo)
    })

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
                newStudentInfo.style.backgroundColor = 'springgreen'
                newStudentInfo.style.color = 'blue'
            }
            else
            {
                newStudentInfo.style.backgroundColor = 'black'
                newStudentInfo.style.color = 'pink'
            }
            information.appendChild(newStudentInfo)
        }
    })
})