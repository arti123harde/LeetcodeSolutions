package org.solutions.leetcode.string.medium;

public class SimplifyPath {

    public static void main(String[] args) {
        System.out.println(simplifyPath("/home/foo/./bar/"));
        System.out.println(simplifyPath("/a/./b/../../c/"));
        System.out.println(simplifyPath("/.../a/../b/c/../d/./"));
        System.out.println(simplifyPath("/../"));
        System.out.println(simplifyPath("/a//b////c/d//././/.."));
        System.out.println(simplifyPath("/home/"));
        System.out.println(simplifyPath("/home//foo/"));
        System.out.println(simplifyPath("/home/user/Documents/../Pictures"));
    }

    public static String simplifyPath(String path) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] strs = path.split("/");
        String lastLiteralAdded = "";
        for(int i=0; i< strs.length; i++) {
            if (strs[i].equals("..")) {
                if(!stringBuilder.isEmpty() && !lastLiteralAdded.isEmpty() && stringBuilder.length() >= lastLiteralAdded.length()){
                    stringBuilder.delete(stringBuilder.length() - (lastLiteralAdded.length()+1), stringBuilder.length());
                    lastLiteralAdded = "";
                }
            }else if(strs[i].equals(".")){
                if(i > 1 && i <= strs.length-1){
                    if(!stringBuilder.isEmpty() && !lastLiteralAdded.isEmpty() && stringBuilder.length() >= lastLiteralAdded.length()){
                        stringBuilder.delete(stringBuilder.length() - (lastLiteralAdded.length()+1), stringBuilder.length());
                        lastLiteralAdded = "";
                    }
                }
            }else if (!strs[i].isEmpty()) {
                stringBuilder.append("/");
                stringBuilder.append(strs[i]);
                lastLiteralAdded = strs[i];
            }
        }
        return stringBuilder.isEmpty() ? stringBuilder.append("/").toString() : stringBuilder.toString();


        //Approach 2 - Using Stack
//        Stack<String> stack = new Stack<String>();
//        String[] components = path.split("/");
//
//        // Split the input string on "/" as the delimiter
//        // and process each portion one by one
//        for (String directory : components) {
//            // A no-op for a "." or an empty string
//            if (directory.equals(".") || directory.isEmpty()) {
//                continue;
//            } else if (directory.equals("..")) {
//                // If the current component is a "..", then
//                // we pop an entry from the stack if it's non-empty
//                if (!stack.isEmpty()) {
//                    stack.pop();
//                }
//            } else {
//                // Finally, a legitimate directory name, so we add it
//                // to our stack
//                stack.add(directory);
//            }
//        }
//
//        // Stich together all the directory names together
//        StringBuilder result = new StringBuilder();
//        for (String dir : stack) {
//            result.append("/");
//            result.append(dir);
//        }
//
//        return result.length() > 0 ? result.toString() : "/";

    }
}
