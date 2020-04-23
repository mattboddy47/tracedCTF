package app.traced.tracedctf;

import android.content.Context;
import android.util.Log;


public class APIKey {
    String username;
    String password;
    String APIKey;
    Context context;
    private static final String a = BuildConfig.a;
    private static final String b = BuildConfig.b;
    private static final String c = BuildConfig.c;
    private static final String d = BuildConfig.d;
    private static final String e = BuildConfig.e;
    private static final String f = BuildConfig.f;
    private static final String g = BuildConfig.g;
    private static final String h = BuildConfig.h;
    private static final String i = BuildConfig.i;
    private static final String j = BuildConfig.j;
    private static final String k = BuildConfig.k;
    private static final String l = BuildConfig.l;
    private static final String m = BuildConfig.m;
    private static final String n = BuildConfig.n;
    private static final String o = BuildConfig.o;
    private static final String p = BuildConfig.p;
    private static final String q = BuildConfig.q;
    private static final String r = BuildConfig.r;
    private static final String s = BuildConfig.s;
    private static final String t = BuildConfig.t;
    private static final String u = BuildConfig.u;
    private static final String v = BuildConfig.v;
    private static final String w = BuildConfig.w;
    private static final String x = BuildConfig.x;
    private static final String y = BuildConfig.y;
    private static final String z = BuildConfig.z;
    private static final String aa = BuildConfig.aa;

    public APIKey(String username, String password, Context context){
        this.username = username;
        this.password = password;
        this.context = context;
        this.APIKey = APIKeyCalc();

    }
    public String getKey(){
        return APIKey;
    }
    private String APIKeyCalc(){
        String key = new String();
        // username and password 1
        String username1 = "admin";
        String password1 = "password";

        // username and password 2
        String username2 = "admin";
        String password2 = "admin";

        //username and password 3
        String username3 = context.getResources().getString(R.string.username);
        String password3 = context.getResources().getString(R.string.password);

        //username and password 4
        String username4 = context.getResources().getString(R.string.obscureUsername);
        String password4 = context.getResources().getString(R.string.obscurePassword);

        // username and password 5
        StringBuilder username5Builder = new StringBuilder(context.getResources().getString(R.string.app_name));
        username5Builder.append(context.getResources().getString(R.string.obscureUsername));
        StringBuilder password5Builder = new StringBuilder(context.getResources().getString(R.string.app_name));
        password5Builder.append(context.getResources().getString(R.string.obscurePassword));

        // username and password 6
        StringBuilder username6Builder = new StringBuilder(context.getResources().getString(R.string.app_name));
        username6Builder.append(context.getResources().getString(R.string.username));
        StringBuilder password6Builder = new StringBuilder(context.getResources().getString(R.string.app_name));
        password6Builder.append(context.getResources().getString(R.string.password));

        //username and password 7
        String username7 = "NOTTODAY!";
        String password7 = "THANKYOU";

        if (username.equals(username1) &&
                password.equals(password1)) {
            //username1 and password1 success
            key = getAPIKey1();
            return key;
        } else if (username.equals(username2) &&
                password.equals(password2)) {
            //username2 and password2 success
            key = getAPIKey2();
            return key;
        } else if (username.equals(username3) &&
                password.equals(password3)) {
            //username3 and password3 success
            key = getAPIKey3();
            return key;
        } else if (username.equals(username4) &&
                password.equals(password4)) {
            //username4 and password4 success
            key = getAPIKey4();
            return key;
        } else if (username.equals(username5Builder.toString()) &&
                password.equals(password5Builder.toString())) {
            //username5 and password5 success
            key = getAPIKey5();
            return key;
        } else if (username.equals(username6Builder.toString()) &&
                password.equals(password6Builder.toString())) {
            //username6 and password6 success
            key = getAPIKey6();
            return key;
        } else if (username.equals(username7) &&
                password.equals(password7)) {
            //username7 and password7 success
            key = getAPIKey7();
            return key;
        }
        return key;
    }
    private static String getAPIKey1(){
        StringBuilder keyBuilder = new StringBuilder(v);
        keyBuilder.append(x);
        keyBuilder.append(c);
        keyBuilder.append(r);
        keyBuilder.append(t);
        return keyBuilder.toString();
    }
    private static String getAPIKey2(){
        StringBuilder keyBuilder = new StringBuilder(y);
        keyBuilder.append(r);
        keyBuilder.append(z);
        keyBuilder.append(c);
        keyBuilder.append(x);
        keyBuilder.append(x);
        keyBuilder.append(w);
        keyBuilder.append(z);
        keyBuilder.append(aa);
        return keyBuilder.toString();
    }
    private static String getAPIKey3(){
        StringBuilder keyBuilder = new StringBuilder(r);
        keyBuilder.append(c);
        keyBuilder.append(q);
        keyBuilder.append(w);
        return keyBuilder.toString();
    }
    private static String getAPIKey4(){
        StringBuilder keyBuilder = new StringBuilder(c);
        keyBuilder.append(c);
        keyBuilder.append(c);
        keyBuilder.append(q);
        keyBuilder.append(h);
        return keyBuilder.toString();
    }
    private static String getAPIKey5(){
        StringBuilder keyBuilder = new StringBuilder(y);
        keyBuilder.append(f);
        keyBuilder.append(z);
        keyBuilder.append(c);
        keyBuilder.append(x);
        keyBuilder.append(x);
        keyBuilder.append(w);
        keyBuilder.append(z);
        keyBuilder.append(aa);
        return keyBuilder.toString();
    }
    private static String getAPIKey6(){
        StringBuilder keyBuilder = new StringBuilder(j);
        keyBuilder.append(i);
        keyBuilder.append(n);
        keyBuilder.append(m);
        keyBuilder.append(d);
        keyBuilder.append(k);
        keyBuilder.append(h);
        keyBuilder.append(u);
        keyBuilder.append(q);
        keyBuilder.append(s);
        keyBuilder.append(g);
        keyBuilder.append(p);
        keyBuilder.append(l);
        keyBuilder.append(o);
        keyBuilder.append(t);
        keyBuilder.append(e);
        keyBuilder.append(f);
        keyBuilder.append(a);
        keyBuilder.append(r);
        keyBuilder.append(c);
        keyBuilder.append(b);
        return keyBuilder.toString();
    }
    private static String getAPIKey7(){
        StringBuilder keyBuilder = new StringBuilder(v);
        keyBuilder.append(x);
        keyBuilder.append(c);
        keyBuilder.append(f);
        keyBuilder.append(t);
        return keyBuilder.toString();
    }

}
