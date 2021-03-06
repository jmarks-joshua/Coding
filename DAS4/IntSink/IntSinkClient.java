import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;

class IntSinkClient {
    public static void main(String args[]) {
        IntSink rt = null;
        String regHost = "localhost";
        Integer regPort = new Integer(1099);
        if (args.length > 0) {
            regHost = args[0];
            if (args.length > 1) regPort = Integer.decode(args[1]);
        }
        try {
            System.out.print("1111111111111\n");
            Registry reg = LocateRegistry.getRegistry(regHost, regPort.intValue());
            Object o = reg.lookup("IntSink");
            rt = (IntSink)o;
        } catch (Exception e) {
            System.out.print("2222222222222\n");
            System.out.format("Error in locating intSink from registry\n");
            e.printStackTrace();
            System.exit(1);
        }

        try {
            System.out.print("333333333333\n");
            rt.ignore(42);	// one call to prime system
            long startTime = System.currentTimeMillis();
            for (int i = 0; i < 10000; i++)
                rt.ignore(42);
            long elapsedTime = System.currentTimeMillis() - startTime;
            System.out.format("10000 calls in %d ms - %d.%03d ms/call\n", elapsedTime, elapsedTime/10000, (elapsedTime%10000)/10);
        } catch (Exception e) {
            System.out.print("4444444444444444\n");
            e.printStackTrace();
            System.exit(1);
        }
    }
}
