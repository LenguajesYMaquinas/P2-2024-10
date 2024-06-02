// DO NOT EDIT THIS FILE! IT IS AUTOMATICALLY GENERATED FROM FILE "src/Coder.gold"
import gold.*;
import gold.structures.*;
import gold.structures.automaton.*;
import gold.structures.bag.*;
import gold.structures.collection.*;
import gold.structures.deque.*;
import gold.structures.disjointset.*;
import gold.structures.graph.*;
import gold.structures.heap.*;
import gold.structures.list.*;
import gold.structures.map.*;
import gold.structures.multimap.*;
import gold.structures.point.*;
import gold.structures.queue.*;
import gold.structures.set.*;
import gold.structures.stack.*;
import gold.structures.tree.*;
import gold.structures.tree.binary.*;
import gold.structures.tree.nary.*;
import gold.structures.tuple.*;
import gold.structures.turingMachine.*;
import gold.swing.*;
import gold.swing.icon.*;
import gold.swing.icon.ajaxload.*;
import gold.swing.icon.famfamfam.*;
import gold.swing.icon.gold.*;
import gold.swing.icon.jlfgr.*;
import gold.swing.icon.wikimedia.*;
import gold.swing.icon.windows.*;
import gold.swing.look.*;
import gold.swing.util.*;
import gold.test.*;
import gold.test.automaton.*;
import gold.test.general.*;
import gold.test.graph.*;
import gold.util.*;
import gold.visualization.*;
import gold.visualization.automaton.*;
import gold.visualization.graph.*;
import gold.visualization.quadtree.*;
import gold.visualization.turingMachine.*;
import gold.visualization.util.*;
import java.lang.*;
import org.apfloat.*;
import static gold.util.GReflection.*;
@SuppressWarnings("all")
public final class Coder {
  static {
    gold.swing.util.GUtilities.installGoldLookAndFeel();
  }
  public static void main(String[] args) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=4;
      Object coder=$fix(Coder.createTransducer());
      $line=5;
      Utilities.test($cast(gold.structures.automaton.IAutomaton.class,coder));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Coder.class,"main",$line);
    }
  }
  public static ITransducer createTransducer() {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=12;
      Object Q=$fix($opUnionY($opCartsY(new Object[]{$opUnionY($opIntvlY('a','d'),GCollections.asSet(GCollections.emptySet())),$opUnionY($opIntvlY('a','d'),GCollections.asSet(GCollections.emptySet())),$opUnionY($opIntvlY('a','d'),GCollections.asSet(GCollections.emptySet())),GCollections.asSet(true,false),GCollections.asSet(true,false),$opIntvlY(0,3)}),GCollections.asSet(GCollections.asList('I','I','I',false,false,0),GCollections.asList('E','E','E','E','E',0))));
      $line=20;
      Object \u03A3=$fix($opUnionY($opIntvlY('a','d'),GCollections.asSet('!','#')));
      $line=21;
      Object O=$fix($opUnionY($opIntvlY('a','d'),GCollections.asSet('!','#','*')));
      $line=22;
      Object q_0=$fix(GCollections.asList('I','I','I',false,false,0));
      $line=23;
      Object F=$fix($opDiffeY(Q,GCollections.asSet(GCollections.asList('E','E','E','E','E',0))));
      $line=24;
      $result=$invokeConstructor(GDeterministicTransducer.class,new Object[]{Q,\u03A3,O,q_0,F,new GMethod(Coder.class,"\u03B4"),new GMethod(Coder.class,"g"),new GMethod(Coder.class,"h")});
      if (true) break $try;
      $line=25;
      $rethrow(new RuntimeException("The function \"createTransducer()\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Coder.class,"createTransducer",$line);
    }
    return $cast(ITransducer.class,$result);
  }
  public static Object \u03B4(java.lang.Iterable $v1, Object \u03C3) {
    int $line=0;
    Object $result=null;
    $try:try {
      java.util.Iterator $v2=GCollections.unmodifiableCollection($v1).iterator();
      Object char1=$v2.next();
      Object char2=$v2.next();
      Object char3=$v2.next();
      Object isEven=$v2.next();
      Object isEqualToPrevious=$v2.next();
      Object index=$v2.next();
      $line=30;
      if ($opEqualY(GCollections.asList(char1,char2,char3,isEven,isEqualToPrevious,index),GCollections.asList('E','E','E','E','E',0))) {
        $line=30;
        $result=GCollections.asList('E','E','E','E','E',0);
        if (true) break $try;
      }
      else {
        $line=33;
        if ($opEqualY(GCollections.asList(char1,char2,char3,isEven,isEqualToPrevious,index),GCollections.asList(GCollections.emptySet(),GCollections.emptySet(),GCollections.emptySet(),true,true,3))) {
          $line=33;
          $result=GCollections.asList(GCollections.emptySet(),GCollections.emptySet(),GCollections.emptySet(),true,true,3);
          if (true) break $try;
        }
        else {
          $line=34;
          if (($opEqualY(\u03C3,'#')&&$opEqualY(index,3))) {
            $line=34;
            $result=GCollections.asList(GCollections.emptySet(),GCollections.emptySet(),GCollections.emptySet(),true,true,3);
            if (true) break $try;
          }
          else {
            $line=37;
            if ((($opEqualY(GCollections.asList(char1,char2,char3,isEven,isEqualToPrevious,index),GCollections.asList('I','I','I',false,false,0))&&$opMembrY(\u03C3,$opIntvlY('a','d')))&&$opEqualY(index,0))) {
              $line=37;
              $result=GCollections.asList(\u03C3,GCollections.emptySet(),GCollections.emptySet(),isEven,true,$opAdditY(index,1));
              if (true) break $try;
            }
            else {
              $line=38;
              if ((((($opMembrY(char1,$opIntvlY('a','d'))&&$opEqualY(char2,GCollections.emptySet()))&&$opEqualY(char3,GCollections.emptySet()))&&$opMembrY(\u03C3,$opIntvlY('a','d')))&&$opEqualY(index,1))) {
                $line=38;
                $result=GCollections.asList(char1,\u03C3,char3,isEven,isEqualToPrevious,$opAdditY(index,1));
                if (true) break $try;
              }
              else {
                $line=39;
                if ((((($opMembrY(char1,$opIntvlY('a','d'))&&$opMembrY(char2,$opIntvlY('a','d')))&&$opEqualY(char3,GCollections.emptySet()))&&$opMembrY(\u03C3,$opIntvlY('a','d')))&&$opEqualY(index,2))) {
                  $line=39;
                  $result=GCollections.asList(char1,char2,\u03C3,isEven,isEqualToPrevious,$opAdditY(index,1));
                  if (true) break $try;
                }
                else {
                  $line=40;
                  if (((($opMembrY(char1,$opIntvlY('a','d'))&&$opMembrY(char2,$opIntvlY('a','d')))&&$opMembrY(char3,$opIntvlY('a','d')))&&$opEqualY(\u03C3,'!'))) {
                    $line=40;
                    $result=GCollections.asList(char1,char2,char3,!$bool(isEven),isEqualToPrevious,0);
                    if (true) break $try;
                  }
                  else {
                    $line=43;
                    if (((((($opMembrY(char1,$opIntvlY('a','d'))&&$opMembrY(char2,$opIntvlY('a','d')))&&$opMembrY(char3,$opIntvlY('a','d')))&&$opEqualY(index,0))&&$opMembrY(\u03C3,$opIntvlY('a','d')))&&$opEqualY(char1,\u03C3))) {
                      $line=43;
                      $result=GCollections.asList(\u03C3,char2,char3,isEven,true,$opAdditY(index,1));
                      if (true) break $try;
                    }
                    else {
                      $line=44;
                      if (((((($opMembrY(char1,$opIntvlY('a','d'))&&$opMembrY(char2,$opIntvlY('a','d')))&&$opMembrY(char3,$opIntvlY('a','d')))&&$opEqualY(index,0))&&$opMembrY(\u03C3,$opIntvlY('a','d')))&&!$opEqualY(char1,\u03C3))) {
                        $line=44;
                        $result=GCollections.asList(\u03C3,char2,char3,isEven,false,$opAdditY(index,1));
                        if (true) break $try;
                      }
                      else {
                        $line=45;
                        if (((((($opMembrY(char1,$opIntvlY('a','d'))&&$opMembrY(char2,$opIntvlY('a','d')))&&$opMembrY(char3,$opIntvlY('a','d')))&&$opEqualY(index,1))&&$opMembrY(\u03C3,$opIntvlY('a','d')))&&$opEqualY(char2,\u03C3))) {
                          $line=45;
                          $result=GCollections.asList(char1,\u03C3,char3,isEven,isEqualToPrevious,$opAdditY(index,1));
                          if (true) break $try;
                        }
                        else {
                          $line=46;
                          if (((((($opMembrY(char1,$opIntvlY('a','d'))&&$opMembrY(char2,$opIntvlY('a','d')))&&$opMembrY(char3,$opIntvlY('a','d')))&&$opEqualY(index,1))&&$opMembrY(\u03C3,$opIntvlY('a','d')))&&!$opEqualY(char2,\u03C3))) {
                            $line=46;
                            $result=GCollections.asList(char1,\u03C3,char3,isEven,false,$opAdditY(index,1));
                            if (true) break $try;
                          }
                          else {
                            $line=47;
                            if (((((($opMembrY(char1,$opIntvlY('a','d'))&&$opMembrY(char2,$opIntvlY('a','d')))&&$opMembrY(char3,$opIntvlY('a','d')))&&$opEqualY(index,2))&&$opMembrY(\u03C3,$opIntvlY('a','d')))&&$opEqualY(char3,\u03C3))) {
                              $line=47;
                              $result=GCollections.asList(char1,char2,\u03C3,isEven,isEqualToPrevious,$opAdditY(index,1));
                              if (true) break $try;
                            }
                            else {
                              $line=48;
                              if (((((($opMembrY(char1,$opIntvlY('a','d'))&&$opMembrY(char2,$opIntvlY('a','d')))&&$opMembrY(char3,$opIntvlY('a','d')))&&$opEqualY(index,2))&&$opMembrY(\u03C3,$opIntvlY('a','d')))&&!$opEqualY(char3,\u03C3))) {
                                $line=48;
                                $result=GCollections.asList(char1,char2,\u03C3,isEven,false,$opAdditY(index,1));
                                if (true) break $try;
                              }
                              else {
                                $line=49;
                                if ((((($opMembrY(char1,$opIntvlY('a','d'))&&$opMembrY(char2,$opIntvlY('a','d')))&&$opMembrY(char3,$opIntvlY('a','d')))&&$opEqualY(index,3))&&$opEqualY(\u03C3,'!'))) {
                                  $line=49;
                                  $result=GCollections.asList(char1,char2,char3,!$bool(isEven),isEqualToPrevious,0);
                                  if (true) break $try;
                                }
                                else {
                                  $line=51;
                                  $result=GCollections.asList('E','E','E','E','E',0);
                                  if (true) break $try;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      $line=53;
      $rethrow(new RuntimeException("The function \"\u03B4(\u27E8char1,char2,char3,isEven,isEqualToPrevious,index\u27E9:java.lang.Iterable,\u03C3:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Coder.class,"\u03B4",$line);
    }
    return $result;
  }
  public static Object h(java.lang.Iterable $v3, Object \u03C3) {
    int $line=0;
    Object $result=null;
    $try:try {
      java.util.Iterator $v4=GCollections.unmodifiableCollection($v3).iterator();
      Object char1=$v4.next();
      Object char2=$v4.next();
      Object char3=$v4.next();
      Object isEven=$v4.next();
      Object isEqualToPrevious=$v4.next();
      Object index=$v4.next();
      $line=57;
      if ($opMembrY(\u03C3,GCollections.asSet('#','!'))) {
        $line=57;
        $result=\u03C3;
        if (true) break $try;
      }
      else {
        $line=59;
        if (((!$opEqualY(GCollections.asList(char1,char2,char3,isEven,isEqualToPrevious,index),GCollections.asList('E','E','E','E','E',0))&&!$bool(isEven))&&$opMembrY(\u03C3,$opUnionY($opIntvlY('a','d'),GCollections.asSet('!','#'))))) {
          $line=59;
          $result=\u03C3;
          if (true) break $try;
        }
        else {
          $line=60;
          $result="";
          if (true) break $try;
        }
      }
      $line=62;
      $rethrow(new RuntimeException("The function \"h(\u27E8char1,char2,char3,isEven,isEqualToPrevious,index\u27E9:java.lang.Iterable,\u03C3:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Coder.class,"h",$line);
    }
    return $result;
  }
  public static Object g(java.lang.Iterable $v5) {
    int $line=0;
    Object $result=null;
    $try:try {
      java.util.Iterator $v6=GCollections.unmodifiableCollection($v5).iterator();
      Object char1=$v6.next();
      Object char2=$v6.next();
      Object char3=$v6.next();
      Object isEven=$v6.next();
      Object isEqualToPrevious=$v6.next();
      Object index=$v6.next();
      $line=66;
      if (((((!$opEqualY(GCollections.asList(char1,char2,char3,isEven,isEqualToPrevious,index),GCollections.asList('E','E','E','E','E',0))&&$bool(isEven))&&$bool(isEqualToPrevious))&&$opEqualY(index,3))&&!$opEqualY(char1,GCollections.emptySet()))) {
        $line=66;
        $result='*';
        if (true) break $try;
      }
      else {
        $line=68;
        if (((((((!$opEqualY(GCollections.asList(char1,char2,char3,isEven,isEqualToPrevious,index),GCollections.asList('E','E','E','E','E',0))&&!$opEqualY(char1,GCollections.emptySet()))&&!$opEqualY(char2,GCollections.emptySet()))&&!$opEqualY(char3,GCollections.emptySet()))&&$bool(isEven))&&!$bool(isEqualToPrevious))&&$opEqualY(index,3))) {
          $line=68;
          Object string=$fix($invokeConstructor(StringBuilder.class,new Object[]{}));
          $line=68;
          $result=$invokeMethod("append",$invokeMethod("append",$invokeMethod("append",string,new Object[]{$invokeMethod(String.class,"valueOf",true,null,new Object[]{char1})}),new Object[]{$invokeMethod(String.class,"valueOf",true,null,new Object[]{char2})}),new Object[]{$invokeMethod(String.class,"valueOf",true,null,new Object[]{char3})});
          if (true) break $try;
        }
        else {
          $line=69;
          $result="";
          if (true) break $try;
        }
      }
      $line=71;
      $rethrow(new RuntimeException("The function \"g(\u27E8char1,char2,char3,isEven,isEqualToPrevious,index\u27E9:java.lang.Iterable)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Coder.class,"g",$line);
    }
    return $result;
  }
}