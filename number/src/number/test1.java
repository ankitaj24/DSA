package number;

import java.util.Arrays;
import java.util.Comparator;

class test1
{
    static class Job{
    	int id;
    	int deadline;
    	int profit;
    	Job(int id,int deadline,int profit){
    		this.id=id;
    		this.deadline=deadline;
    		this.profit=profit;
    	}
    }
	
	//Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        Arrays.sort(arr,new Comparator<Job>() {
        	@Override
        	public int compare(Job o1, Job o2) {
        		if(o1.profit!=o2.profit) {
        			return o2.profit-o1.profit;
        		}else
        			return o2.deadline-o1.deadline;
        		
        		
        		
				/*if(o1.deadline!=o2.deadline) {
					return o1.deadline-o2.deadline;
				}else
					return o2.profit-o1.profit;*/
			}
        });
        for(int i=0;i<n;i++) {
        	System.out.println(arr[i].id+" "+arr[i].deadline+" "+arr[i].profit);
        }
        return new int[2];
    }
    public static void main(String args[]) {
    	Job arr[]=new Job[5];
    	//1 2 100 2 1 19 3 2 27 4 1 25 5 1 15
    	arr[0]=new Job(1,2,100);
    	arr[1]=new Job(2,1,19);
    	arr[2]=new Job(3,2,27);
    	arr[3]=new Job(4,1,25);
    	arr[4]=new Job(5,1,15);
    	test1 ob=new test1();
    	ob.JobScheduling(arr, 5);
    }
}