class Singleton {
    private static Singleton ins = null;
    private Singleton(){}
    public static Singleton getInstance()
    {
    if (ins == null)
    ins = new Singleton();
    return ins;
    }
    }
    