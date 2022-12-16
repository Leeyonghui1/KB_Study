using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace T6
{
    internal class T6
    {
        static void Main(string[] args)
        {
            // 1&2
            Console.WriteLine("숫자 5개 입력");
            int[] nums = new int[5];
            for(int i = 0; i <5; i++)
            {
                int input = int.Parse(Console.ReadLine());
                nums[i] = input;
            }
            int max = nums[0];
            int min = nums[0];
            int idx_max = 0;
            int idx_min = 0;
            for(int i = 0; i<nums.Length; i++)
            {
                if(max<nums[i])
                {
                    max = nums[i];
                    idx_max = i;
                }
                if(min>nums[i])
                {
                    min = nums[i];
                    idx_min = i;
                }
            }
            Console.WriteLine($"최대값 : {max} , 인덱스 : {idx_max}");
            Console.WriteLine($"최소값 : {min} , 인덱스 : {idx_min}");
            max = nums[0];
            min = nums[0];
            idx_max = 0;
            idx_min = 0;
            int idx = 0;
            foreach(var item in nums)
            {
                if (max < item)
                {
                    max = item;
                    idx_max = idx;
                }
                if (min > item)
                {
                    min = item;
                    idx_min = idx;
                }
                idx++;
            }
            Console.WriteLine($"최대값 : {max} , 인덱스 : {idx_max}");
            Console.WriteLine($"최소값 : {min} , 인덱스 : {idx_min}");


            // 3.
            Console.WriteLine("숫자 10개 입력");
            int[] nums2 = new int[10];
            for(int i = 0; i < nums2.Length; i++)
            {
                int input = int.Parse(Console.ReadLine());
                nums2[i] = input;
            }
            for (int i = 0; i < nums2.Length; i++)
            {
                if (nums2[i] % 2 != 0)
                    nums2[i] = 0;
                if (nums2[i] != 0)
                    Console.Write(nums2[i]+" ");
            }
        }
    }
}
