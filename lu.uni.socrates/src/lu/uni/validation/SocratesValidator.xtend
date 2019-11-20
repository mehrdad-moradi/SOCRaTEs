/*
 * generated by Xtext 2.17.0.M1
 */
package lu.uni.validation

import com.google.inject.Inject
import java.util.HashSet
import lu.uni.rfol.timedterm.TimedTerm
import lu.uni.socrates.SocratesPackage
import lu.uni.socrates.Tvariable
import org.eclipse.xtext.resource.IContainer
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider
import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.CheckType
import java.util.ArrayList
import lu.uni.socrates.Oracle
import org.eclipse.emf.ecore.EObject
import lu.uni.socrates.ForAllformula
import lu.uni.socrates.Existsformula
import lu.uni.socrates.Requirement

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class SocratesValidator extends AbstractSocratesValidator {

	@Inject
	ResourceDescriptionsProvider resourceDescriptionsProvider;

	@Inject
	IContainer.Manager containerManager;

	@Check(CheckType.NORMAL)
	def checkTimedVariableDuplicated(Tvariable variable) {

		var EObject c = variable;
		while (!(c instanceof Requirement)) {

			c = c.eContainer;
		}
		var tobeAnalized = newArrayList();
		tobeAnalized.add(c)

		var found = false;
		while (!tobeAnalized.isEmpty) {
			var curr = tobeAnalized.get(0);
			tobeAnalized.remove(0);
			print(curr)

			if (curr instanceof ForAllformula) {
				tobeAnalized.add(curr.forallchild)
				if (curr.bound.ref.name.equals(variable.name)) {
					print(variable.name)
					if (found == false) {
						found = true;
					} else {
						error("Timed variable quantified twice in this oracle", SocratesPackage.Literals.TVARIABLE__NAME);
					}
				}
			} else {
				if (curr instanceof Existsformula) {
					tobeAnalized.add(curr.existschild)

					if (curr.bound.ref.name.equals(variable.name)) {
						print(variable.name)
						if (found == false) {
							found = true;
						} else {
							error("Timed variable quantified twice in this oracle", SocratesPackage.Literals.TVARIABLE__NAME);
						}
					}
				} else {
					tobeAnalized.addAll(curr.eContents);

				}
			}

		}
	}

	@Check(CheckType.NORMAL)
	def checkTimedVariablesShouldBeDefined(Tvariable variable) {

		var EObject c = variable;

		if (!((c.eContainer.eContainer instanceof ForAllformula) ||
			(c.eContainer.eContainer instanceof Existsformula))) {

			while (c instanceof Oracle) {

				c = c.eContainer;
				if (c instanceof ForAllformula) {
					var formula = c as ForAllformula;
					if (formula.getBound().ref.name.equals(variable)) {
						return null;
					}

				}
				if (c instanceof Existsformula) {
					var formula = c as Existsformula;
					if (formula.getBound().ref.name.equals(variable)) {
						return null;
					}

				}
			}
			error("Timed variable is not scoped", SocratesPackage.Literals.TVARIABLE__NAME);

		}

	}

}
