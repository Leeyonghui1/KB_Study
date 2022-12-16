// jQuery로 작성
$(
    function()
    {
        const sounds = $('audio')
        const pads = $('.pads div')
        const visual = $('.visual')
        const title = $('.title')
        // pad1~6의 색상을 담는 배열
        const colors = ['red','orange','yellow','green','blue','plum']
        // 음악 재생이 끝났을 경우
        sounds.each(function(index,soundFile)
        {
            soundFile.onended = function()
            {
                visual.text('')
                title.text('')
            }
        })
        const createBubbles = function(index)
        {
            visual.text('')
            // css에서 적용될 div태그
            const bubble = $('<div></div>')
            visual.append(bubble)
            bubble.css('background',colors[index]).
                   css('top','300px').
                   css('animation','animation 2000ms linear infinite both')
        }
        // class명이 pads인 태그 안쪽의 div들에게 적용되는 함수
        pads.each(function(index,pad)
        {
            // pad는 pads안에 있는 태그들
            // 특정 파일 클릭할 때
            $(pad).on('click',function()
            {
                // 모든 사운드들을 일단 멈춘다
                sounds.each(function(index,soundFile)
                {
                    soundFile.pause()
                })
                // 내가 클릭한 부분의 사운드
                if(sounds[index])
                {   // 처음부터 재생
                    sounds[index].currentTime = 0
                    sounds[index].play()

                    // 파일명을 적절히 잘라서 표시
                    // const strArray = sounds[index].src.split('sound/') // sound/ 문자 기준으로 자름
                    // title.text(strArray[1].split('.')[0])
                    // title.text(strArray[1])
                    const strArray = sounds[index].src.split('sound/')[1].split('.') 
                    title.text(strArray[0])
                    
                }
                createBubbles(index)
            })
        })
    }
)