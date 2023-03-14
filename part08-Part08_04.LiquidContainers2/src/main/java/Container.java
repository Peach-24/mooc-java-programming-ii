public class Container {
    public int value;
    public int maxCapacity;
    public int minCapacity;

    public Container(){
        this.value = 0;
        this.maxCapacity = 100;
        this.minCapacity = 0;
    }

    public int contains(){
        return this.value;
    }

    public void add(int amount){
        if (amount > 0) {
            int sum = amount + this.value;
            if (sum >= this.maxCapacity) {
                this.value = this.maxCapacity;
            } else {
                this.value += amount;
            }
        }
    }

    public void remove(int amount){
        if (amount > 0) {
            int sum = this.value - amount;
            if (sum <= this.minCapacity) {
                this.value = this.minCapacity;
            } else {
                this.value -= amount;
            }
        }
    }

    public String toString(){
//        return String.format("%2d/%2d", this.value, this.maxCapacity);
        return this.value + "/" + this.maxCapacity;
    }
}
