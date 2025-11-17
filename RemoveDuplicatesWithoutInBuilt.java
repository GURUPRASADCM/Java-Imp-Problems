
    public class RemoveDuplicatesWithoutInBuilt {

        public static void main(String[] args) {

            String name = "guruprasad";
            System.out.println(RemoveDuplicatesWithoutInBuilt(name));
        }
        public static String RemoveDuplicatesWithoutInBuilt(String name) {

            boolean[] visited = new boolean[256];
            String result = "";

            for (int i = 0; i < name.length(); i++) {
                char c = name.charAt(i);
                if(!visited[c]){
                    visited[c] = true;
                    result = result+c;
                }
            }
            return result;
        }

    }
