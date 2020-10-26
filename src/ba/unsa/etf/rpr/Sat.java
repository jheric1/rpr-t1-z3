package ba.unsa.etf.rpr;

public class Sat {
        int sati,minute,sekunde;
        Sat(int sati, int minute, int sekunde) { postavi(sati, minute, sekunde); }
        void postavi(int sati1, int minute1, int sekunde1) { sati=sati1;
            minute = minute1;
            sekunde=sekunde1; }
        void sljedeci() {
            sekunde++;
            if (sekunde==60) { sekunde=0; minute++; }
            if (minute==60) { minute=0; sati++; }
            if (sati==24) sati=0;
        }
        void prethodni() {
            sekunde--;
            if (sekunde==-1) { sekunde=59; minute--; }
            if (minute==-1) { minute=59; sati--; }
            if (sati==-1) sati=23;
        }
        void pomjeriZa(int pomak) {
            if (pomak>0) for (int i=0; i<pomak; i++) sljedeci();
		else for (int i=0; i<-pomak; i++) prethodni();
        }
        int GetSate()  { return sati; }
        int GetMinute()  { return minute; }
        int GetSekunde()  { return sekunde; }
        void ispisi()  { System.out.printf("%d:%d:%d\n", GetSate(),GetMinute(),GetSekunde());}


    public static void main(String[] args) {
	// write your code here
        Sat s= new Sat(15,30,45);
        s.ispisi();
        s.sljedeci();
        s.ispisi();
        s.pomjeriZa(-48);
        s.ispisi();
        s.postavi(0, 0, 0);
        s.ispisi();
        }
}
