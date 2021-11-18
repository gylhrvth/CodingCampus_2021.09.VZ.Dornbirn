package Plamena.week8.Camera;

public class Picture {
        private String motive;
        private double resolution;
        private double size;

        public Picture(String motive){
                this.motive = motive;

        }

        public void setResolution(double resolution) {
                this.resolution = resolution;
        }

        public double getSize() {
                return size;
        }

        public void setSize(double size) {
                this.size = size;
        }

        public String getMotive() {
                return motive;
        }

        @Override
        public String toString(){
                return motive;
        }
}
