/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader.criteria;

/**
 *
 * @author jerry pc
 */
public class EndsWithQuestionOrExclamationMark implements Criterion{
    

    @Override
    public boolean complies(String line) {
        if(line.isEmpty()){
            return false;
        }
        int lastChar = line.charAt(line.length() -1);
        return (lastChar == '?' || lastChar == '!');
    }
    
}
