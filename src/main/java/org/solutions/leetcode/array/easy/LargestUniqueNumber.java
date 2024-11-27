package org.solutions.leetcode.array.easy;

import java.util.Arrays;

/**
 * @author Arti Harde
 */
public class LargestUniqueNumber {

    public static void main(String[] args) {
        System.out.println(largestUniqueNumber(new int[]{986,894,500,128,880,552,131,188,399,283,132,905,826,95,165,199,
                579,910,914,407,733,476,668,866,647,264,452,562,967,499,385,440,337,333,934,137,741,309,876,366,86,94,434,
                891,309,732,517,104,203,180,729,883,575,512,320,524,745,788,699,941,306,114,130,359,463,564,358,671,712,112,
                963,24,969,858,247,179,57,757,636,1,632,930,421,323,589,36,574,926,34,200,638,917,650,1,281,120,988,998,14,
                51,74,876,243,869,184,551,618,276,171,667,401,327,676,858,590,394,22,238,249,656,665,650,463,612,72,918,208,
                256,669,895,439,705,475,548,383,185,32,606,239,59,799,157,827,962,965,950,153,629,709,485,876,392,267,841,464,
                765,502,135,697,442,914,86,500,659,859,705,855,180,842,413,926,686,767,89,897,315,117,413,637,584,285,127,669,
                589,780,986,415,471,372,860,625,357,803,287,397,147,665,884,444,306,140,44,199,532,252,969,630,553,450,597,496,
                478,934,286,376,22,38,440,276,47,158,196,764,422,767,605,282,676,113,738,82,272,585,699,966,63,141,930,316,165,
                425,696,516,438,431,962,195,187,642,168,723,42,594,863,218,476,64,813,856,34,434,502,690,691,235,656,25,185,904,
                843,731,122,28,622,534,235,182,366,271,995,837,862,843,529,299,880,553,978,908,308,76,713,377,140,275,129,791,811,
                62,330,280,602,587,946,631,274,957,877,524,304,368,986,230,669,931,369,9,639,734,609,463,11,133,6,841,151,126,82,
                333,188,323,543,917,973,30,922,840,390,309,43,261,177,607,411,322,92,573,366,719,736,102,466,147,310,357,791,148,
                258,427,677,276,844,772,597,761,387,278,352,788,524,746,729,248,662,124,929,453,299,485,544,861,665,303,14,995,860,
                116,757,457,329,342,391,378,303,715,715,800,777,971,78,95,206,234,82,599,811,711,184,146,832,507,216,762,261,259,
                10,284,900,502,379,834,297,749,849,475,476,301,409,696,94,803,655,781,522,677,625,217,863,302,651,638,879,69,822,
                652,481,678,483,400,991,918,884,22,849,489,30,302,461,958,140,116,753,882,716,659,36,745,515,763,107,362,995,584,
                921,234,794,629,506,299,80,342,250,79,365,114,975,21,813,1000,404,431,619,495,193,879,529,125,434,196,119,266,198,
                446,572,202,352,926,96,4,728,341,223,778,341,53,196,740,813,93,727,504,13,336,210,724,470,225,590,613,226,782,60,
                457,870,919,258,496,833,625,455,163,964,143,165,790,108,436,209,291,323,173,895,504,233,735,214,841,981,186,155,
                569,399,98,9,98,13,883,639,683,313,460,821,768,736,95,435,904,244,914,83,649,789,11,370,224,527,503,636,938,784,
                28,726,932,230,557,243,70,160,425,461,539,422,254,903,251,797,819,54,509,599,646,369,639,804,940,22,423,714,746,
                54,38,473,473,857,131,492,831,530,825,171,856,165,345,900,410,827,884,849,778,357,42,317,745,27,719,16,173,433,
                460,326,694,868,274,188,977,69,684,949,110,351,533,644,366,647,187,631,961,557,365,23,588,291,240,64,351,965,255,
                546,320,71,610,704,889,226,726,174,998,418,711,919,131,504,906,66,66,572,207,940,147,122,143,20,612,259,280,376,
                494,742,957,659,519,601,616,792,35,961,488,252,986,556,162,778,586,304,745,364,534,563,365,356,358,114,564,969,
                778,217,968,837,588,189,282,843,740,118,235,406,711,447,797,224,41,286,427,422,819,146,195,745,787,647,877,483,
                273,123,631,625,778,246,295,469,348,754,196,801,557,235,627,291,369,759,281,540,278,198,284,483,238,133,809,872,
                552,260,763,888,469,157,429,918,591,532,785,669,48,405,517,531,369,882,302,226,925,391,575,263,697,834,337,790,
                112,200,2,439,677,767,90,443,246,657,253,802,573,29,143,625,44,848,21,22,564,147,175,392,367,344,360,486,214,723,
                364,257,960,357,183,890,638,474,84,221,688,972,573,680,1000,78,97,703,69,960,899,453,245,630,99,458,320,792,214,
                758,133,63,150,537,229,170,18,765,702,130,6,635,256,267,307,756,2,481,50,601,300,660,260,373,1000,809,497,221,690,
                490,235,354,538,612,803,63,497,587,261,761,234,421,73,596,160,950,159,826,499,644,389,685,680,265,291,557,967,749,
                90,632,915,183,393,716,49,193,560,765,291,390,71,370,375,391,939,137,610,714,177,271,668,619,945,534,902,608,406,
                185,645,340,550,388,584,754,432,713,15,475,887,917,767,437,72,895,37,769,364,227,386,225,134,96,725,318,811,87,748,
                844,516,8,764,591}));
        System.out.println(largestUniqueNumber(new int[]{11,10,11}));
        System.out.println(largestUniqueNumber(new int[]{5,7,3,9,4,9,8,3,1}));
        System.out.println(largestUniqueNumber(new int[]{9,9,8,8}));
    }

    public static int largestUniqueNumber(int[] nums) {
        Arrays.sort(nums);
        int j = nums.length-1;
        while(j >= 0) {
            int count = 0;
            while(j > 0 && nums[j - 1] == nums[j]) {
                j--;
                count++;
            }
            if(count == 0) return nums[j];
            else j--;
        }
        return -1;
    }
}
