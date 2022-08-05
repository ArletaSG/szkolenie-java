package pl.cyber.trainees.wyjasnienia;

public class ChoinkaZGwiazdekTablica {
    public static void main(String[] args)
    {
        int  wysokosc =9;
        String [][] choinka = new String[wysokosc/2+1][wysokosc];
        for (int i =0; i < wysokosc/2+1;i++)
        {
            for(int j=0;j < wysokosc;j++)
            {
                choinka[i][j]="+";
            }
        }
        String gwiazdka = "*";
        for (int i =0; i < wysokosc/2+1;i++)
        {
            for(int j=0;j < wysokosc;j++)
            {
                if(j==wysokosc/2) {
                    choinka[i][j] = gwiazdka;
                }
                else if( (j>wysokosc/2)&&(j<=wysokosc/2 + i))
                {
                    choinka[i][j] = gwiazdka;
                }
                else if( (j<wysokosc/2)&&(j>=wysokosc/2 - i))
                {
                    choinka[i][j] = gwiazdka;
                }
            }
        }
        for (int i =0; i < wysokosc/2+1;i++)
        {
            System.out.println();
            for(int j=0;j < wysokosc;j++)
            {
                System.out.print(choinka[i][j]);
            }
        }
    }
}
