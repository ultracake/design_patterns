package Builder;

public class CakeSelfBuild
{
    //All final attributes
    private final String name; // required
    private final String taste; // required
    private final int layers; // optional
    private final String decorText; // optional
    private final String taste2; // optional

    private CakeSelfBuild(CakeBuilder builder)
    {
        this.name = builder.name;
        this.taste = builder.taste;
        this.layers = builder.layers;
        this.decorText = builder.decorText;
        this.taste2 = builder.taste2;
    }

    //All getters, and NO setters to provde immutability
    public String getName() {
        return name;
    }
    public String getTaste() {
        return taste;
    }
    public int getLayers() {
        return layers;
    }
    public String getDecorText() {
        return decorText;
    }
    public String getTaste2() {
        return taste2;
    }

    @Override
    public String toString()
    {
        return "Cake: "+this.name +", " +this.taste +", "+this.layers +", "+this.decorText +", "+this.taste2;
    }

    //The builder class
    public static class CakeBuilder
    {
        private final String name;
        private final String taste;
        private int layers;
        private String decorText;
        private String taste2;

        //require
        public CakeBuilder(String name, String taste)
        {
            this.name = name;
            this.taste = taste;
        }

        //optional
        public CakeBuilder layers(int layers)
        {
            this.layers = layers;
            return this;
        }

        //optional
        public CakeBuilder decorText(String decorText)
        {
            this.decorText = decorText;
            return this;
        }

        //optional
        public CakeBuilder taste2(String taste2)
        {
            this.taste2 = taste2;
            return this;
        }

        //Return the finally constrcucted Cake object
        public CakeSelfBuild build()
        {
            CakeSelfBuild cake = new CakeSelfBuild(this);
            //validateCakeObject(cake);
            return cake;
        }

        /*
        private void validateCakeObject(CakeSelfBuild cake)
        {
            //Do some basic validations to check
            //if user object does not break any assumption of system
        }*/
    }


}
