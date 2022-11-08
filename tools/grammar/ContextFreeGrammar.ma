(*^

::[	frontEndVersion = "Microsoft Windows Mathematica Notebook Front End Version 2.2";
	microsoftWindowsStandardFontEncoding;
	fontset = title, "MS Serif", 18, L0, center, nohscroll, R32768;
	fontset = subtitle, "MS Serif", 14, L0, center, nohscroll, R32768;
	fontset = subsubtitle, "MS Serif", 12, L0, center, nohscroll;
	fontset = section, "MS Serif", 14, L0, B65280, grayBox;
	fontset = subsection, "MS Serif", 12, L0, B65280, blackBox;
	fontset = subsubsection, "MS Serif", 12, L0, B65280, whiteBox;
	fontset = text, "MS Serif", 10, L0, B65280;
	fontset = smalltext, "MS Sans Serif", 10, L0, B65280;
	fontset = input, "Courier New", 10, L0, nowordwrap;
	fontset = output, "Courier New", 10, L0, nowordwrap;
	fontset = message, "Courier New", 10, L0, nowordwrap, R65280;
	fontset = print, "Courier New", 10, L0, nowordwrap, G32768, B32768;
	fontset = info, "Courier New", 10, L0, nowordwrap, R32768, B32768;
	fontset = postscript, "Courier New", 8, L0, nowordwrap;
	fontset = name, "Helv", 10, L0, nohscroll, italic, B65280;
	fontset = header, "Helv", 18, L0, nohscroll, bold;
	fontset = footer, "Helv", 18, L0, center, nohscroll, bold;
	fontset = help, "Helv", 10, L0, nohscroll;
	fontset = clipboard, "Helv", 12, L0, nohscroll;
	fontset = completions, "Helv", 12, L0, nowordwrap, nohscroll;
	fontset = graphics, "Courier New", 10, L0, nowordwrap, nohscroll;
	fontset = special1, "Helv", 12, L0, nowordwrap, nohscroll;
	fontset = special2, "Helv", 12, L0, center, nowordwrap, nohscroll;
	fontset = special3, "Helv", 12, L0, right, nowordwrap, nohscroll;
	fontset = special4, "Helv", 12, L0, nowordwrap, nohscroll;
	fontset = special5, "Helv", 12, L0, nowordwrap, nohscroll;
	fontset = leftheader, "Helv", 12, L0, nowordwrap, nohscroll;
	fontset = leftfooter, "Helv", 12, L0, nowordwrap, nohscroll;
	fontset = reserved1, "Courier New", 10, L0, nowordwrap, nohscroll;]
:[font = title; inactive; nohscroll; center; ]
Context-Free Grammars
:[font = subtitle; inactive; nohscroll; center; ]
Preliminary and incomplete version
28 January 1994
:[font = section; inactive; startGroup; Cclosed; ]
Introduction
:[font = text; inactive; endGroup; ]
The command AcceptQ[grammar,string,integer] determines if the string is in the language generated by the grammar.  It will stop if its attempt to produce a derivation reaches a depth of integer.  The grammar is given as a list of lists, each list representing a production as an ordered pair of strings (see the Examples section).  AcceptQ performs a bottom up construction of all possible derivations (and prints the successive stages), and will always succeed if the grammar has the property that the right side of each production is longer than the left side. 
:[font = section; inactive; startGroup; Cclosed; ]
Implementation
:[font = input; nowordwrap; ]
FindPlaces[grammar_List,s_String] :=
   StringPosition[s,Part[#,2]]& /@ grammar
(*FindPlaces[grammar,string] produces a list of pairs {m,n}
   where the right side of a production in grammar occurs
   as a substring of string from position m to position n.
   The lists of pairs are grouped by production: the kth
   list of pairs correspond to the occurrences of the right
   side of production k of grammar.*)
:[font = input; nowordwrap; ]
BDL[placeslist_List,r_String,s_String] :=
   If[Length[placeslist]>0,
      StringInsert[StringDrop[s,#],r,Part[#,1]]&
           /@ placeslist,
      {}
     ]
(*placeslist should consist of a list of pairs (m,n) of positive
  integers.  BDL[placeslist,r,s] produces a list of strings,
  each of which is the result of replacing characters m through
  n of s with the string r for one of the pairs (m,n) of
  placeslist.*)
:[font = input; nowordwrap; ]
BackDerive[grammar_List,s_String] :=
   Module[{places = StringPosition[s,Part[#,2]]& /@ grammar},
  (BDL[FindPlaces[grammar,s][[#]],grammar[[#]][[1]],s]& /@
   Table[k,{k,Length[grammar]}])]
:[font = input; nowordwrap; ]
BackDerive[grammar_List,x_List] :=
   BackDerive[grammar,#]& /@ x
:[font = input; nowordwrap; ]
SimpleBackDerive[grammar_List,x_List] :=
   Union[Flatten[BackDerive[grammar,x]]]
:[font = input; nowordwrap; ]
EmptyQ[x_List] := Length[x]==0
:[font = input; endGroup; nowordwrap; ]
AcceptQ[grammar_List,s_String,maxit_Integer:30] :=
  Module[{tries=List[s],k=0},
   (While[(!MemberQ[tries,"S"] && !EmptyQ[tries] && k++<maxit),
        (tries=SimpleBackDerive[grammar,tries];
           Print[k," ",tries])
          ];
     MemberQ[tries,"S"])
        ]
:[font = section; inactive; startGroup; Cclosed; ]
Examples
:[font = text; inactive; ]
Execute the following definitions, giving you a grammar g1 and some strings.  Then execute the commands.
:[font = input; nowordwrap; ]
g1 := {{"S","SS"},
  {"S","aSb"},
  {"S","bSa"},
  {"S","cC"},
  {"C","cC"},
  {"C","c"}}
:[font = input; nowordwrap; ]
st = "abSabbaSbSacCab"
:[font = input; nowordwrap; ]
st2="aSbbcCa"
:[font = input; nowordwrap; ]
FindPlaces[g1,"aSSS"] (*Example*)
:[font = input; nowordwrap; ]
BDL[{{1,2},{2,5}},"xy","abcde"]
:[font = input; nowordwrap; ]
SimpleBackDerive[g1,{"ab","acCb","aSbb","SS"}]
:[font = input; nowordwrap; ]
AcceptQ[g1,st]
:[font = input; endGroup; nowordwrap; ]
AcceptQ[g1,st2]
:[font = section; inactive; startGroup; Cclosed; ]
Acknowledgments
:[font = text; inactive; endGroup; ]
This work was supported by the Consolidated Natural Gas Corporation
:[font = section; inactive; startGroup; Cclosed; ]
Author & Copyright
:[font = text; inactive; ]
Charles Wells
Department of Mathematics
Case Western Reserve University
University Circle
Cleveland, OH 44106-7058
:[font = text; inactive; ]
Phone 216 368 2893 or 216 774 1926
:[font = text; inactive; ]
Email cfw2@po.cwru.edu
:[font = text; inactive; endGroup; ]
Copyright 1994 by Charles Frederick Wells.  May be freely redistributed for noncommercial purposes provided it is unchanged.
^*)