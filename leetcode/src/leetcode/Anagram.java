package leetcode;

public class Anagram {
	
	public static void divide( char a[], int s, int e ){

        if( s >= e )
            return;

        int mid = s + ( e - s ) / 2;
        divide( a, s, mid );
        divide( a, mid + 1, e );
        conquer( a, s, mid, e );
    }

    public static void conquer( char a[], int s, int mid, int e ){

        char c[] = new char[ e - s + 1 ];
        int idx1 = s;
        int mididx = mid + 1;
        int idxc = 0;
        
        while( idx1 <= mid && e >= mididx ){
            if( a[idx1] >= a[mididx] )
                c[idxc++] = a[mididx++];
            
            else
                c[idxc++] = a[idx1++];
        }

        while( idx1 <= mid )
            c[idxc++] = a[idx1++];

        while( e >= mididx )
            c[idxc++] = a[mididx++];

        for( int i = 0, j = s; i < c.length; i++, j++ )
            a[j] = c[i];
    }

    public static boolean isAnagram(String s, String t) {
    	
    	if( s.length() != t.length() )
    		return false;
    	
        char a[] = s.toCharArray();
        char b[] = t.toCharArray();

        int l1 = a.length - 1;
        int l2 = b.length - 1;

        divide( a, 0, l1 );
        divide( b, 0, l2 );

        for( int i = 0; i <= l1; i++ ){
            if( a[i] != b[i] )
                return false;
        }
        return true;
    }

	public static void main(String[] args) {
		
		System.out.println(isAnagram( "anagram", "nagaram"));
		

	}

}
