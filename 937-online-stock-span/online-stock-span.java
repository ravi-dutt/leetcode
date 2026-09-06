class DayPrice{
    int day;
    int price;
    DayPrice(int d,int p)
    {
        this.day=d;
        this.price=p;
    }
}
class StockSpanner {
    Stack<DayPrice>stack;
    int day;
    public StockSpanner() {
    stack=new Stack<>();
    day=-1;
    stack.push(new DayPrice(day,0));       
    }
    public int next(int price) {
     day++;
     int span=0;
     while(true)
     {
        if(stack.size()==1)
        {
            span=day-stack.peek().day;
            stack.push(new DayPrice(day,price));
            break;
        }
        DayPrice top=stack.peek();
        if(top.price>price)
        {
           span=day-top.day;
           stack.push(new DayPrice(day,price));
           break; 
        }
        else
        {
            stack.pop();
        }
     } 
     return span;  
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */