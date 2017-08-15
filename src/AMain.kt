import org.tensorics.core.tree.domain.ResolvedExpression
import org.tensorics.core.tree.domain.Expression
import org.tensorics.core.resolve.engine.ResolvingEngine
import org.tensorics.core.resolve.engine.ResolvingEngines


fun main(args: Array<String>) {
	var engine = ResolvingEngines.defaultEngine();


	var aValue = 0.2;
	var anExp = ResolvedExpression.of(0.3);

	var another = aValue + anExp;

	System.out.println(engine.resolve(another));
}
