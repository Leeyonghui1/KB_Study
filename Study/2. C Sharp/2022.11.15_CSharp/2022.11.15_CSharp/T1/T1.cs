using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace T1
{
    internal class T1
    {
        static void Main(string[] args)
        {
            // 1. 안녕하세요 라는 메시지를 출력
            Console.WriteLine("Q1)");
            Console.WriteLine("안녕하세요");
            Console.WriteLine();
            // 2. 10+20, 7/3, 7%3, 7-3, 10*20 출력
            Console.WriteLine("Q2)");
            Console.WriteLine(10 + 20);
            Console.WriteLine(7 / 3);
            Console.WriteLine(7 % 3);
            Console.WriteLine(7 - 3);
            Console.WriteLine(10 * 20);
            Console.WriteLine();
            // 3. "10"+10 출력, '2'+100 출력, "10"+'2'출력
            Console.WriteLine("Q3)");
            Console.WriteLine("10" + 10);
            Console.WriteLine('2' + 100);
            Console.WriteLine("10" + '2');
            Console.WriteLine();
            // 4. int 변수에 자신의 태어난 연도를 입력 후 출력
            Console.WriteLine("Q4) 태어난 연도를 입력하세요.");
            int birth4 = int.Parse(Console.ReadLine());
            Console.WriteLine($"당신은 {birth4}년생입니다.");
            Console.WriteLine();
            // 5. string 변수에 내 이름을 입력받고, 출력
            Console.WriteLine("Q5) 이름을 입력하세요.");
            string name5 = Console.ReadLine();
            Console.WriteLine($"당신의 이름은 {name5}입니다.");
            Console.WriteLine();
            // 6. \" 를 이용하여(escape 문자) 자기 소개 메시지(이름,나이) 출력
            Console.WriteLine("Q6) 이름과 나이를 입력하세요.");
            Console.Write("이름 : ");
            string name6 = Console.ReadLine();
            Console.Write("나이 : ");
            int age6 = int.Parse(Console.ReadLine());
            Console.WriteLine($"이름은 \"{name6}\"입니다. 나이는 \"{age6}\"세입니다.");
            Console.WriteLine();
            // 7. 내 나이 입력받은 걸 이용하여 내가 몇년생인지 구하기
            Console.WriteLine("Q7) 나이를 입력하세요");
            Console.Write("나이 : ");
            int age7 = int.Parse(Console.ReadLine());
            Console.WriteLine($"출생년도 : {DateTime.Now.Year - age7 + 1}년");
            Console.WriteLine();
            // 8. 현재 연도 값을 입력받고, 내가 태어난 연도 값을 입력받아, 한국식 나이 계산해서 출력하기
            Console.WriteLine("Q8) 출생연도를 입력하세요");
            int birth7 = int.Parse(Console.ReadLine());
            Console.WriteLine($"나이 : {DateTime.Now.Year - birth7 + 1}살");
            Console.WriteLine();
            // 9. 내가 입력한 글자의 첫번째 글자를 출력할 것
            Console.WriteLine("Q9) 문장을 입력하세요.");
            string input9 = Console.ReadLine();
            Console.Write("입력한 문장의 첫 번째 글자는 : ");
            Console.WriteLine(input9[0]);
            Console.WriteLine();
            // 10. 정사각형의 변 길이를 입력받고, 정사각형의 넓이 구하기(정사각형 넓이 : 변x변)
            Console.WriteLine("Q10) 정사각형 변의 길이를 입력하세요.");
            Console.Write("정사각형 한 변 길이 : ");
            int w10 = int.Parse(Console.ReadLine());
            Console.WriteLine($"정사각형 넓이 : {w10 * w10}");
            Console.WriteLine();

            // 11. 내가 입력한 숫자가 음수일 경우 "음수"를 출력
            Console.WriteLine("Q11) 숫자를 입력하세요.");
            Console.Write("입력 숫자 : ");
            int num11 = int.Parse(Console.ReadLine());
            string result11 = num11 < 0 ? "음수" : "0이상 양수";
            Console.WriteLine(result11);
            Console.WriteLine();
            // 12. 내가 입력한 숫자가 0을 넘는다면 자연수, 그 외에는 자연수 아님을 출력
            Console.WriteLine("Q12) 숫자를 입력하세요.");
            Console.Write("입력 숫자 : ");
            int num12 = int.Parse(Console.ReadLine());
            string result12 = num12 > 0 ? "자연수" : "자연수 아님";
            Console.WriteLine(result12);
            Console.WriteLine();

            // 13. 랜덤숫자를 입력받아 0:가위, 1:바위, 2:보 를 출력하게 할 것
            Console.WriteLine("Q13) 랜덤 숫자를 생성합니다.");
            int num13 = new Random().Next(3);
            Console.WriteLine($"생성된 랜덤 숫자는 : {num13}");
            switch (num13)
            {
                case 0:
                    Console.WriteLine("가위");
                    break;
                case 1:
                    Console.WriteLine("바위");
                    break;
                case 2:
                    Console.WriteLine("보");
                    break;
            }
            Console.WriteLine();
            // 14. 0,1,2 중 하나를 입력받아 (Q13)의 결과와 비교해서 가위바위보 승패 결정
            Console.WriteLine("Q14) 숫자를 입력하세요(0, 1, 2)");
            Console.Write("입력한 숫자 : ");
            int num14 = int.Parse(Console.ReadLine());
            Console.WriteLine();
            switch (num14)
            {
                case 0:
                    Console.WriteLine("사용자가 낸 것 : 가위");
                    switch (num13)
                    {
                        case 0:
                            Console.WriteLine("컴퓨터가 낸 것 : 가위");
                            Console.WriteLine("결과 : 무승부");
                            break;
                        case 1:
                            Console.WriteLine("컴퓨터가 낸 것 : 바위");
                            Console.WriteLine("결과 : 컴퓨터 승");
                            break;
                        case 2:
                            Console.WriteLine("컴퓨터가 낸 것 : 보");
                            Console.WriteLine("결과 : 사용자 승");
                            break;
                    }
                    break;
                case 1:
                    Console.WriteLine("사용자가 낸 것 : 바위");
                    switch (num13)
                    {
                        case 0:
                            Console.WriteLine("컴퓨터가 낸 것 : 가위");
                            Console.WriteLine("결과 : 사용자 승");
                            break;
                        case 1:
                            Console.WriteLine("컴퓨터가 낸 것 : 바위");
                            Console.WriteLine("결과 : 무승부");
                            break;
                        case 2:
                            Console.WriteLine("컴퓨터가 낸 것 : 보");
                            Console.WriteLine("결과 : 컴퓨터 승");
                            break;
                    }
                    break;
                case 2:
                    Console.WriteLine("사용자가 낸 것 : 보");
                    switch (num13)
                    {
                        case 0:
                            Console.WriteLine("컴퓨터가 낸 것 : 가위");
                            Console.WriteLine("결과 : 컴퓨터 승");
                            break;
                        case 1:
                            Console.WriteLine("컴퓨터가 낸 것 : 바위");
                            Console.WriteLine("결과 : 사용자 승");
                            break;
                        case 2:
                            Console.WriteLine("컴퓨터가 낸 것 : 보");
                            Console.WriteLine("결과 : 무승부");
                            break;
                    }
                    break;
            }
            Console.WriteLine();
            // 15. (Q14)를 if문으로 풀기
            Console.WriteLine("Q15) 숫자를 입력하세요(0, 1, 2)");
            Console.Write("입력한 숫자 : ");
            int num15 = int.Parse(Console.ReadLine());
            Console.WriteLine();
            if (num15 == num13)
            {
                string result15 = num15 == 0 ? "가위" : (num15 == 1 ? "바위" : "보");
                Console.WriteLine($"사용자와 컴퓨터는 {result15}를 내서 결과는 무승부입니다.");
            }
            else
            {
                if (num15 + 2 == num13 || num15 - num13 == 1)
                {
                    string result15_p = num15 == 0 ? "가위" : (num15 == 1 ? "바위" : "보");
                    string result15_c = num13 == 0 ? "가위" : (num13 == 1 ? "바위" : "보");
                    Console.WriteLine($"사용자가 낸 것 : {result15_p}");
                    Console.WriteLine($"컴퓨터가 낸 것 : {result15_c}");
                    Console.WriteLine("결과 : 사용자 승");
                }
                else if (num15 == num13 + 2 || num13 - num15 == 1)
                {
                    string result15_p = num15 == 0 ? "가위" : (num15 == 1 ? "바위" : "보");
                    string result15_c = num13 == 0 ? "가위" : (num13 == 1 ? "바위" : "보");
                    Console.WriteLine($"사용자가 낸 것 : {result15_p}");
                    Console.WriteLine($"컴퓨터가 낸 것 : {result15_c}");
                    Console.WriteLine("결과 : 컴퓨터 승");
                }
            }
            Console.WriteLine();

            // 16. 반복문을 이용하여 1부터 10까지 출력
            Console.WriteLine("Q16) 1~10까지 출력");
            for (int i = 1; i <= 10; i++)
                Console.Write(i + " ");
            Console.WriteLine(); Console.WriteLine();
            // 17. 1부터 10까지 곱한 값을 출력
            Console.WriteLine("Q17) 1~10까지 곱한 값을 출력");
            int sum17 = 1;
            for (int i = 1; i <= 10; i++)
                sum17 *= i;
            Console.WriteLine($"총 곱한 값 : {sum17}");
            Console.WriteLine();
            // 18. 안녕하세요 1번째 손님부터 안녕하세요 10번째 손님까지 출력하기
            Console.WriteLine("Q18) 손님 출력");
            for (int i = 1; i <= 10; i++)
                Console.WriteLine($"안녕하세요 {i}번째 손님");
            Console.WriteLine();
            // 19. 숫자를 입력하고, 그 숫자의 제곱을 출력하다가 0을 입력하면 종료하기
            Console.WriteLine("Q19) 숫자를 입력하세요");
            while (true)
            {
                int num19 = int.Parse(Console.ReadLine());
                Console.WriteLine($"제곱 결과 : {num19 * num19}");
                if (num19 == 0)
                    break;
            }
            Console.WriteLine();
            // 20. 1부터 10까지 값을 곱하되, 홀수만 곱할 것
            // (1) continue 활용
            Console.WriteLine("Q20-1) 1~10까지 홀수 곱셈(continue 사용)");
            int sum20_1 = 1;
            for (int i = 1; i <= 10; i++)
            {
                if (i % 2 == 0)
                    continue;
                sum20_1 *= i;
            }
            Console.WriteLine($"1~10사이 홀수만 곱한 값 : {sum20_1}");
            Console.WriteLine();
            Console.WriteLine("Q20-2) 1~10까지 홀수 곱셈(continue 미사용)");
            int sum20_2 = 1;
            for (int i = 1; i <= 10; i++)
            {
                if (i % 2 != 0)
                    sum20_2 *= i;
            }
            Console.WriteLine($"1~10사이 홀수만 곱한 값 : {sum20_2}");
        }
    }
}
