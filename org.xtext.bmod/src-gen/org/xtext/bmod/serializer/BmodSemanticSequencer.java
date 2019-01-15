/*
 * generated by Xtext 2.16.0
 */
package org.xtext.bmod.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.bmod.bmod.Area;
import org.xtext.bmod.bmod.BmodPackage;
import org.xtext.bmod.bmod.Coordinate;
import org.xtext.bmod.bmod.Door;
import org.xtext.bmod.bmod.DoorRef;
import org.xtext.bmod.bmod.EmergencySign;
import org.xtext.bmod.bmod.Exit;
import org.xtext.bmod.bmod.Fire;
import org.xtext.bmod.bmod.Floorplan;
import org.xtext.bmod.bmod.Import;
import org.xtext.bmod.bmod.Person;
import org.xtext.bmod.bmod.Room;
import org.xtext.bmod.services.BmodGrammarAccess;

@SuppressWarnings("all")
public class BmodSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private BmodGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == BmodPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case BmodPackage.AREA:
				sequence_Area(context, (Area) semanticObject); 
				return; 
			case BmodPackage.COORDINATE:
				sequence_Coordinate(context, (Coordinate) semanticObject); 
				return; 
			case BmodPackage.DOOR:
				sequence_Door(context, (Door) semanticObject); 
				return; 
			case BmodPackage.DOOR_REF:
				sequence_DoorRef(context, (DoorRef) semanticObject); 
				return; 
			case BmodPackage.EMERGENCY_SIGN:
				sequence_EmergencySign(context, (EmergencySign) semanticObject); 
				return; 
			case BmodPackage.EXIT:
				sequence_Exit(context, (Exit) semanticObject); 
				return; 
			case BmodPackage.FIRE:
				sequence_Fire(context, (Fire) semanticObject); 
				return; 
			case BmodPackage.FLOORPLAN:
				sequence_Floorplan(context, (Floorplan) semanticObject); 
				return; 
			case BmodPackage.IMPORT:
				sequence_Import(context, (Import) semanticObject); 
				return; 
			case BmodPackage.PERSON:
				sequence_Person(context, (Person) semanticObject); 
				return; 
			case BmodPackage.ROOM:
				sequence_Room(context, (Room) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Area returns Area
	 *
	 * Constraint:
	 *     (from=Coordinate to=Coordinate (without+=Coordinate without+=Coordinate*)?)
	 */
	protected void sequence_Area(ISerializationContext context, Area semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Coordinate returns Coordinate
	 *
	 * Constraint:
	 *     (x=INT y=INT)
	 */
	protected void sequence_Coordinate(ISerializationContext context, Coordinate semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BmodPackage.Literals.COORDINATE__X) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodPackage.Literals.COORDINATE__X));
			if (transientValues.isValueTransient(semanticObject, BmodPackage.Literals.COORDINATE__Y) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodPackage.Literals.COORDINATE__Y));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCoordinateAccess().getXINTTerminalRuleCall_1_0(), semanticObject.getX());
		feeder.accept(grammarAccess.getCoordinateAccess().getYINTTerminalRuleCall_3_0(), semanticObject.getY());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DoorRef returns DoorRef
	 *
	 * Constraint:
	 *     to=[Door|VARNAME]
	 */
	protected void sequence_DoorRef(ISerializationContext context, DoorRef semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BmodPackage.Literals.DOOR_REF__TO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodPackage.Literals.DOOR_REF__TO));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDoorRefAccess().getToDoorVARNAMETerminalRuleCall_1_0_1(), semanticObject.eGet(BmodPackage.Literals.DOOR_REF__TO, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Door returns Door
	 *
	 * Constraint:
	 *     (name=VARNAME from=Coordinate to=Coordinate)
	 */
	protected void sequence_Door(ISerializationContext context, Door semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BmodPackage.Literals.DOOR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodPackage.Literals.DOOR__NAME));
			if (transientValues.isValueTransient(semanticObject, BmodPackage.Literals.DOOR__FROM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodPackage.Literals.DOOR__FROM));
			if (transientValues.isValueTransient(semanticObject, BmodPackage.Literals.DOOR__TO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodPackage.Literals.DOOR__TO));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDoorAccess().getNameVARNAMETerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getDoorAccess().getFromCoordinateParserRuleCall_3_0(), semanticObject.getFrom());
		feeder.accept(grammarAccess.getDoorAccess().getToCoordinateParserRuleCall_5_0(), semanticObject.getTo());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EmergencySign returns EmergencySign
	 *
	 * Constraint:
	 *     (from=[Door|VARNAME] ref=DoorRef)
	 */
	protected void sequence_EmergencySign(ISerializationContext context, EmergencySign semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BmodPackage.Literals.EMERGENCY_SIGN__FROM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodPackage.Literals.EMERGENCY_SIGN__FROM));
			if (transientValues.isValueTransient(semanticObject, BmodPackage.Literals.EMERGENCY_SIGN__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodPackage.Literals.EMERGENCY_SIGN__REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEmergencySignAccess().getFromDoorVARNAMETerminalRuleCall_2_0_1(), semanticObject.eGet(BmodPackage.Literals.EMERGENCY_SIGN__FROM, false));
		feeder.accept(grammarAccess.getEmergencySignAccess().getRefDoorRefParserRuleCall_3_0(), semanticObject.getRef());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Exit returns Exit
	 *
	 * Constraint:
	 *     location=Coordinate
	 */
	protected void sequence_Exit(ISerializationContext context, Exit semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BmodPackage.Literals.EXIT__LOCATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodPackage.Literals.EXIT__LOCATION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExitAccess().getLocationCoordinateParserRuleCall_2_0(), semanticObject.getLocation());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Fire returns Fire
	 *
	 * Constraint:
	 *     location=Coordinate
	 */
	protected void sequence_Fire(ISerializationContext context, Fire semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BmodPackage.Literals.FIRE__LOCATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodPackage.Literals.FIRE__LOCATION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFireAccess().getLocationCoordinateParserRuleCall_2_0(), semanticObject.getLocation());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Floorplan
	 *     Floorplan returns Floorplan
	 *
	 * Constraint:
	 *     (
	 *         imports+=Import* 
	 *         (
	 *             rooms+=Room | 
	 *             doors+=Door | 
	 *             persons+=Person | 
	 *             exits+=Exit | 
	 *             fires+=Fire | 
	 *             signs+=EmergencySign
	 *         )*
	 *     )
	 */
	protected void sequence_Floorplan(ISerializationContext context, Floorplan semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Import returns Import
	 *
	 * Constraint:
	 *     importURI=STRING
	 */
	protected void sequence_Import(ISerializationContext context, Import semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BmodPackage.Literals.IMPORT__IMPORT_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodPackage.Literals.IMPORT__IMPORT_URI));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0(), semanticObject.getImportURI());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Person returns Person
	 *
	 * Constraint:
	 *     (name=VARNAME location=Coordinate action=[ActionDesc|VARNAME])
	 */
	protected void sequence_Person(ISerializationContext context, Person semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BmodPackage.Literals.PERSON__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodPackage.Literals.PERSON__NAME));
			if (transientValues.isValueTransient(semanticObject, BmodPackage.Literals.PERSON__LOCATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodPackage.Literals.PERSON__LOCATION));
			if (transientValues.isValueTransient(semanticObject, BmodPackage.Literals.PERSON__ACTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodPackage.Literals.PERSON__ACTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPersonAccess().getNameVARNAMETerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getPersonAccess().getLocationCoordinateParserRuleCall_3_0(), semanticObject.getLocation());
		feeder.accept(grammarAccess.getPersonAccess().getActionActionDescVARNAMETerminalRuleCall_5_0_1(), semanticObject.eGet(BmodPackage.Literals.PERSON__ACTION, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Room returns Room
	 *
	 * Constraint:
	 *     (name=VARNAME (hasCapacity?='[' capacity=INT)? areas+=Area areas+=Area*)
	 */
	protected void sequence_Room(ISerializationContext context, Room semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
