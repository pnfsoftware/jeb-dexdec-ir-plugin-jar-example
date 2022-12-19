import com.pnfsoftware.jeb.core.units.code.android.ir.AbstractDOptimizer;

/**
 * A sample IR optimizer plugin for dexdec.
 * 
 * @author Nicolas Falliere
 *
 */
public class DOptSampleCompiledPlugin extends AbstractDOptimizer {

    public DOptSampleCompiledPlugin() {
    }

    @Override
    public int perform() {
        logger.info("dexdec IR optimizer plugin is being called");
        return 0;
   }
}