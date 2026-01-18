package com.icecreamrush;
class BubbleSort 
{

    public void sort(IceCreamFlavor[] flavors) 
    {

        int n = flavors.length;

        for (int i = 0; i < n - 1; i++) 
        {

            // Repeated adjacent comparison
            for (int j = 0; j < n - i - 1; j++)
            {

                // Swap if current flavor sold less than next
                if (flavors[j].soldCount < flavors[j + 1].soldCount) {

                    IceCreamFlavor temp = flavors[j];
                    flavors[j] = flavors[j + 1];
                    flavors[j + 1] = temp;
                }
            }
        }
    }
}
