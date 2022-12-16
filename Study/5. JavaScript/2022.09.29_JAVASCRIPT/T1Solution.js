// P1.js의 jQ문법을 js문법으로 바꾸기
window.addEventListener('load', (function()
{
    // const sounds = $('audio')
    const sounds = document.querySelectorAll('audio')
    // const pads = $('.pads div')
    const pads = document.querySelectorAll('.pads div')
    // const visual = $('.visual')
    const visual = document.querySelector('.visual')
    // const title = $('.title')
    const title = document.querySelector('.title')
    
    const colors = ['red','orange','yellow','green','blue','plum']
    /*
    sounds.each(function(index,soundFile)
    {
        soundFile.onended = function()
        {
            visual.text('')
            title.text('')
        }
    })
    */
    sounds.forEach(function(soundFile)
    {
        soundFile.onended = function()
        {
            visual.innerHTML = ''
            title.innerHTML = ''
        }
    })
    
    const createBubbles = function(index)
    {
        // visual.text('')
        visual.innerHTML = ''
        // const bubble = $('<div></div>')
        const bubble = document.createElement('div')
        // visual.append(bubble)
        visual.appendChild(bubble)
        /*
        bubble.css('background',colors[index]).
        css('top','300px').
        css('animation','animation 2000ms linear infinite both')
        */
        bubble.style.background = colors[index]
        bubble.style.top = '300px'
        bubble.style.animation = 'animation 2000ms linear infinite both'
    }
    /*
    pads.each(function(index,pad)
    {
        $(pad).on('click',function()
        {
            sounds.each(function(index,soundFile)
            {
                soundFile.pause()
            })
            if(sounds[index])
            {  
                sounds[index].currentTime = 0
                sounds[index].play()
                
                const strArray = sounds[index].src.split('sound/')[1].split('.') 
                title.text(strArray[0])
                
            }
            createBubbles(index)
        })
    })
    */
    pads.forEach(function(pad,index)
    {
        pad.addEventListener('click',function()
        {
            sounds.forEach(function(inx)
            {
                inx.pause()
            })
            if(sounds[index])
            {
                sounds[index].currentTime = 0
                sounds[index].play()
                const styArray = sounds[index].src.split('sound/')
                title.innerHTML = styArray[1].split('.')[0]
            }
            createBubbles(index)
        })
    })

})
)
