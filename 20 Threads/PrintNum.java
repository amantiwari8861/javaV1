class PrintNum implements Runnable
{  
    int num;
    PrintNum(int num)
    {
        this.num=num;
    }
    @Override
    public void run()
    {
        System.out.println(num+" by "+Thread.currentThread().getName());
    }
}
//9918977258