class Solution {
    public long solution(String numbers) {
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<numbers.length(); ){
            switch(numbers.charAt(i)){
                case 'z':
                    sb.append(0);
                    i += 4;
                    break;
                case 'o':
                    sb.append(1);
                    i += 3;
                    break;
                case 't':
                    if(numbers.charAt(i + 1) == 'w'){
                        sb.append(2);
                        i += 3;
                    }else{
                        sb.append(3);
                        i += 5;
                    }
                    break;
                case 'f':
                    if(numbers.charAt(i + 1) == 'o'){
                        sb.append(4);
                    }else{
                        sb.append(5);
                    }
                    i += 4;
                    break;
                case 's':
                    if(numbers.charAt(i + 1) == 'i'){
                        sb.append(6);
                        i += 3;
                    }else{
                        sb.append(7);
                        i += 5;
                    }
                    break;
                case 'e':
                    sb.append(8);
                    i += 5;
                    break;
                case 'n':
                    sb.append(9);
                    i += 4;
                    break;
            }
        }
        return Long.parseLong(sb.toString());
    }
}