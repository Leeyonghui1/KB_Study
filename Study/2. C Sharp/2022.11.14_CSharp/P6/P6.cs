using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P6
{
    internal class P6
    {
        static void Main(string[] args)
        {
            int[] numbers = { 1, 2, 3 };
            int[] numbers2 = new int[3];
            numbers2[0] = 1;
            numbers2[1] = 2;
            numbers2[2] = 3;

            // 2차원 배열
            int[,] numbers_2 = new int[2, 3];
            numbers_2[0, 0] = 1;
            numbers_2[0, 1] = 2;
            numbers_2[0, 2] = 3;
            numbers_2[1, 0] = 4;
            numbers_2[1, 1] = 5;
            numbers_2[1, 2] = 6;
            
            for(int i = 0; i < numbers.Length; i++)
                Console.WriteLine(numbers[i]);
            foreach(var item in numbers)
                Console.WriteLine(item);
            // 2차원배열 출력 :: for, while, foreach
            for(int i = 0; i < numbers_2.GetLength(0); i++)
            {
                for(int j =0; j<numbers_2.GetLength(1); j++)
                    Console.WriteLine($"[{i},{j}]={numbers_2[i, j]}");
            }
        }
    }
}
