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
public class AtLeastOne implements Criterion {
    
    private Criterion[] c1;
    
    public AtLeastOne(Criterion... crits){
        c1 = crits;
    }

    @Override
    public boolean complies(String line) {
        boolean comp = false;
        for(Criterion crit: c1){
            if(crit.complies(line)){
                comp = true;
            }
        }
        return comp;
    }
    
    
}
