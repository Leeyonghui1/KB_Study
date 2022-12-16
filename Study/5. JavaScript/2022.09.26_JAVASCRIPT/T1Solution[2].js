function genLotto(startnum)
{
    startnum = Number(startnum)
    let lotto = [startnum]
    // 난수생성
    // indexOf 이용한 중복제거
    for(let i = 1 ; i < 6 ; i++)
    {
        let num = Math.floor(Math.random()*45)+1
        // indexOf :: 해당 값이 배열 안에서 어디에 위치하는지 알려줌
        // Ex) [10,20,30] 일때 indexOf(20) = 1
        //     [10,21,30] 일때 indexOf(20) = -1
        if(lotto.indexOf(num) != -1 || num < startnum)
        {
            i--
            continue
        }
        lotto[i] = num
    }

    // 정렬코드(오름차순 정렬)
    // sort :: 함수를 매개변수로 하는 함수(콜백함수)
    // sort안에 들어가는 함수를 이용해서 배열 정렬
    // 매개변수 a,b는 배열안에 있는 값
    // 두 개의 값을 서로 비교해서 음수, 0, 양수 
    // 나오는 값에 따라 정렬
    lotto.sort(function(a,b) {return a-b})
    return lotto
}