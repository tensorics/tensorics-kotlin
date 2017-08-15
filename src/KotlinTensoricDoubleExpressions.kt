

import org.tensorics.core.lang.TensoricDoubleExpressions
import org.tensorics.core.quantity.QuantifiedValue
import org.tensorics.core.tensor.Tensor
import org.tensorics.core.tree.domain.Expression
import org.tensorics.core.tree.domain.ResolvedExpression
import org.tensorics.core.units.Unit


/* left exp, right exp */

operator fun Expression<Double>.plus(right: Expression<Double>): Expression<Double> {
	return TensoricDoubleExpressions.calculate(this).plus(right);
}

operator fun Expression<Double>.times(right: Expression<Double>): Expression<Double> {
	return TensoricDoubleExpressions.calculate(this).times(right);
}

operator fun Expression<Double>.div(right: Expression<Double>): Expression<Double> {
	return TensoricDoubleExpressions.calculate(this).dividedBy(right);
}

operator fun Expression<Double>.minus(right: Expression<Double>): Expression<Double> {
	return TensoricDoubleExpressions.calculate(this).minus(right);
}

/* left exp, right double */

operator fun Expression<Double>.plus(right: Double): Expression<Double> {
	return TensoricDoubleExpressions.calculate(this).plus(right);
}

operator fun Expression<Double>.times(right: Double): Expression<Double> {
	return TensoricDoubleExpressions.calculate(this).times(right);
}

operator fun Expression<Double>.div(right: Double): Expression<Double> {
	return TensoricDoubleExpressions.calculate(this).dividedBy(right);
}

operator fun Expression<Double>.minus(right: Double): Expression<Double> {
	return TensoricDoubleExpressions.calculate(this).minus(right);
}

/* left double, right exp */

operator fun Double.plus(right: Expression<Double>): Expression<Double> {
	return TensoricDoubleExpressions.calculate(ResolvedExpression.of(this)).plus(right);
}

operator fun Double.times(right: Expression<Double>): Expression<Double> {
	return TensoricDoubleExpressions.calculate(ResolvedExpression.of(this)).times(right);
}

operator fun Double.div(right: Expression<Double>): Expression<Double> {
	return TensoricDoubleExpressions.calculate(ResolvedExpression.of(this)).dividedBy(right);
}

operator fun Double.minus(right: Expression<Double>): Expression<Double> {
	return TensoricDoubleExpressions.calculate(ResolvedExpression.of(this)).minus(right);
}

/* left exp of quantified values, right exp of quantified values */

operator fun Expression<QuantifiedValue<Double>>.plus(right: Expression<QuantifiedValue<Double>>): Expression<QuantifiedValue<Double>> {
	return TensoricDoubleExpressions.calculateQ(this).plus(right);
}

operator fun Expression<QuantifiedValue<Double>>.minus(right: Expression<QuantifiedValue<Double>>): Expression<QuantifiedValue<Double>> {
	return TensoricDoubleExpressions.calculateQ(this).minus(right);
}

operator fun Expression<QuantifiedValue<Double>>.times(right: Expression<QuantifiedValue<Double>>): Expression<QuantifiedValue<Double>> {
	return TensoricDoubleExpressions.calculateQ(this).times(right);
}

operator fun Expression<QuantifiedValue<Double>>.div(right: Expression<QuantifiedValue<Double>>): Expression<QuantifiedValue<Double>> {
	return TensoricDoubleExpressions.calculateQ(this).dividedBy(right);
}

/* left exp of quantified value of doubles, right quantified value */

operator fun Expression<QuantifiedValue<Double>>.plus(right: QuantifiedValue<Double>): Expression<QuantifiedValue<Double>> {
	return TensoricDoubleExpressions.calculateQ(this).plus(right);
}

operator fun Expression<QuantifiedValue<Double>>.minus(right: QuantifiedValue<Double>): Expression<QuantifiedValue<Double>> {
	return TensoricDoubleExpressions.calculateQ(this).minus(right);
}

operator fun Expression<QuantifiedValue<Double>>.times(right: QuantifiedValue<Double>): Expression<QuantifiedValue<Double>> {
	return TensoricDoubleExpressions.calculateQ(this).times(right);
}

operator fun Expression<QuantifiedValue<Double>>.div(right: QuantifiedValue<Double>): Expression<QuantifiedValue<Double>> {
	return TensoricDoubleExpressions.calculateQ(this).dividedBy(right);
}


/* left exp of quantified value of doubles, right value and (tensorics) unit */
 fun Expression<QuantifiedValue<Double>>.plus(right: Double, rightUnit: Unit): Expression<QuantifiedValue<Double>> {
	return TensoricDoubleExpressions.calculateQ(this).plus(right, rightUnit);
}
 fun Expression<QuantifiedValue<Double>>.minus(right: Double, rightUnit: Unit): Expression<QuantifiedValue<Double>> {
	return TensoricDoubleExpressions.calculateQ(this).minus(right, rightUnit);
}

/* The following ones seem to give problems with type inference ...*/

//operator fun Expression<QuantifiedValue<Double>>.times(right: Double, rightUnit: Unit): Expression<QuantifiedValue<Double>> {
//	return TensoricDoubleExpressions.calculateQ(this).times(right, rightUnit);
//}
//
//operator fun Expression<QuantifiedValue<Double>>.dividedBy(right: Double, rightUnit: Unit): Expression<QuantifiedValue<Double>> {
//	return TensoricDoubleExpressions.calculateQ(this).dividedBy(right, rightUnit);
//}

/* left exp of quantified value of doubles, right value and (jscience) unit */

/* No idea yet how to do this, because of type params */
//operator fun Expression<QuantifiedValue<Double>>.plus(right: Double, rightUnit: javax.measure.unit.Unit): Expression<QuantifiedValue<Double>> {
//	return TensoricDoubleExpressions.calculateQ(this).plus(right, rightUnit);
//}


/* left quantified value, right exp */

operator fun QuantifiedValue<Double>.plus(right: Expression<QuantifiedValue<Double>>): Expression<QuantifiedValue<Double>> {
	return TensoricDoubleExpressions.calculateQ(ResolvedExpression.of(this)).plus(right);
}

operator fun QuantifiedValue<Double>.minus(right: Expression<QuantifiedValue<Double>>): Expression<QuantifiedValue<Double>> {
	return TensoricDoubleExpressions.calculateQ(ResolvedExpression.of(this)).minus(right);
}

operator fun QuantifiedValue<Double>.times(right: Expression<QuantifiedValue<Double>>): Expression<QuantifiedValue<Double>> {
	return TensoricDoubleExpressions.calculateQ(ResolvedExpression.of(this)).times(right);
}

operator fun QuantifiedValue<Double>.div(right: Expression<QuantifiedValue<Double>>): Expression<QuantifiedValue<Double>> {
	return TensoricDoubleExpressions.calculateQ(ResolvedExpression.of(this)).dividedBy(right);
}


/* left exp of tensors of double */

operator fun Expression<Tensor<Double>>.plus(right: Expression<Tensor<Double>>): Expression<Tensor<Double>> {
	return TensoricDoubleExpressions.calculateT(this).plus(right);
}

 fun Expression<Tensor<Double>>.elementTimes(right: Expression<Tensor<Double>>): Expression<Tensor<Double>> {
	return TensoricDoubleExpressions.calculateT(this).elementTimes(right);
}

 fun Expression<Tensor<Double>>.dividedBy(right: Expression<Tensor<Double>>): Expression<Tensor<Double>> {
	return TensoricDoubleExpressions.calculateT(this).elementDividedBy(right);
}

operator fun Expression<Tensor<Double>>.minus(right: Expression<Tensor<Double>>): Expression<Tensor<Double>> {
	return TensoricDoubleExpressions.calculateT(this).minus(right);
}

/* iterable methods */

 fun avarageOf(iterable: Expression<Iterable<Double>>): Expression<Double> {
	return TensoricDoubleExpressions.averageOf(iterable);
}

 fun sumOf(iterable: Expression<Iterable<Double>>): Expression<Double> {
	return TensoricDoubleExpressions.sumOf(iterable);
}

 fun rmsOf(iterable: Expression<Iterable<Double>>): Expression<Double> {
	return TensoricDoubleExpressions.rmsOf(iterable);
}

 fun sizeOf(iterable: Expression<Iterable<Double>>): Expression<Double> {
	return TensoricDoubleExpressions.sizeOf(iterable);
}

/* test functions */
/* left: exp of doubles, right exp of doubles */

 fun Expression<Double>.isEqualTo(right: Expression<Double>): Expression<Boolean> {
	return TensoricDoubleExpressions.testIf(this).isEqualTo(right);
}

 fun Expression<Double>.isLessThan(right: Expression<Double>): Expression<Boolean> {
	return TensoricDoubleExpressions.testIf(this).isLessThan(right);
}

 fun Expression<Double>.isLessOrEqualThan(right: Expression<Double>): Expression<Boolean> {
	return TensoricDoubleExpressions.testIf(this).isLessOrEqualThan(right);
}

 fun Expression<Double>.isGreaterThan(right: Expression<Double>): Expression<Boolean> {
	return TensoricDoubleExpressions.testIf(this).isGreaterThan(right);
}

 fun Expression<Double>.isGreaterOrEqualThan(right: Expression<Double>): Expression<Boolean> {
	return TensoricDoubleExpressions.testIf(this).isGreaterOrEqualThan(right);
}

/* left: exp of doubles, right exp of doubles */

 fun Expression<Double>.isEqualTo(right: Double): Expression<Boolean> {
	return TensoricDoubleExpressions.testIf(this).isEqualTo(right);
}

 fun Expression<Double>.isLessThan(right: Double): Expression<Boolean> {
	return TensoricDoubleExpressions.testIf(this).isLessThan(right);
}

 fun Expression<Double>.isLessOrEqualThan(right: Double): Expression<Boolean> {
	return TensoricDoubleExpressions.testIf(this).isLessOrEqualThan(right);
}

 fun Expression<Double>.isGreaterThan(right: Double): Expression<Boolean> {
	return TensoricDoubleExpressions.testIf(this).isGreaterThan(right);
}

 fun Expression<Double>.isGreaterOrEqualThan(right: Double): Expression<Boolean> {
	return TensoricDoubleExpressions.testIf(this).isGreaterOrEqualThan(right);
}

/* left: douobles, right exp of doubles */
 fun Double.isEqualTo(right: Expression<Double>): Expression<Boolean> {
	return TensoricDoubleExpressions.testIf(ResolvedExpression.of(this)).isEqualTo(right);
}

 fun Double.isLessThan(right: Expression<Double>): Expression<Boolean> {
	return TensoricDoubleExpressions.testIf(ResolvedExpression.of(this)).isLessThan(right);
}

 fun Double.isLessOrEqualThan(right: Expression<Double>): Expression<Boolean> {
	return TensoricDoubleExpressions.testIf(ResolvedExpression.of(this)).isLessOrEqualThan(right);
}

 fun Double.isGreaterThan(right: Expression<Double>): Expression<Boolean> {
	return TensoricDoubleExpressions.testIf(ResolvedExpression.of(this)).isGreaterThan(right);
}

 fun Double.isGreaterOrEqualThan(right: Expression<Double>): Expression<Boolean> {
	return TensoricDoubleExpressions.testIf(ResolvedExpression.of(this)).isGreaterOrEqualThan(right);
}


/* TODO still missing */
/* left exp of tensors of double, right Tensors of double */
/* left exp of tensors of double, right double */
/* left tensor of double, right exp of tensor of double */

/* left exp of tensor of quantified value of double, right exp of tensor of quantified value of double */
/* left exp of tensor of quantified value of double, right exp of quantified value of double */
/* left exp of tensor of quantified value of double, right tensor of quantified value of double */
/* left exp of tensor of quantified value of double, right quantified value of double */
/* vice versa the above ;-) */

/* element negative of all the above */

/* test functions for expressions of iterables (e.g. all less ..., anyLess))*/
/* test functions for expressions of tensors */













