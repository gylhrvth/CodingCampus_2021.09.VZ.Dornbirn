package danny.classes.TaskCamera;

public class CameraProgram {
    public static void main(String[] args) {

        CameraClass nikon = new CameraClass(18,105,
                "D5200","Nikon",24.1);

        CameraClass canon = new CameraClass(30,70,
                "XY150","Nikon",18.5);



        nikon.takePhoto();
        System.out.println();
        System.out.println(canon);
    }


}
