package sgm.labs;

// this list supports until 10 ^ 3003 (millinillion)
// centillion = 10 ^ 303
// 10 duotrigintillion is googol
// 10 to the power googol is googolplex

/*
 * 10n is called   n-plex
10-n = 1 / 10n is called   n-minex
With this pattern we can build extremely large:

googolplex = 10googol
googolplexplex = 10googolplex
googolplexplexplex = 10googolplexplex
googolplexplexplexplex = 10googolplexplexplex
...
... and small numbers:

googolminex = 1 / 10googol
googolplexminex = 1 / 10googolplex
googolplexplexminex = 1 / 10googolplexplex
googolplexplexplexminex = 1 / 10googolplexplexplex
 */

public final class Words {

	public static String[] highs = {"hundred", "thousand", "million", "billion", "trillion", "quadrillion", "quintillion", "sextillion",
		"septillion", "octillion", "nonillion", 
		"decillion", "undecillion", "duodecillion", "tredecillion", "quattuordecillion","quindecillion", "sexdecillion", 
					"septendecillion", "octodecillion", "novemdecillion", 
		"vigintillion", "unvigintillion", "duovigintillion", "trevigintillion", "quattuorvigintillion", "quinvigintillion", "sexvigintillion", 
					"septenvigintillion", "octovigintillion", "novemvigintillion", 
		"trigintillion", "untrigintillion", "duotrigintillion", "tretrigintillion","quattotrigintillion", "quintrigintillion", "sextrigintillion", 
					"septrigintillion", "octotrigintillion", "novemtrigintillion",
		"quadragintillion", "unquadragintillion", "duoquadragintillion", "trequadragintillion", "quattoquadragintillion", "quinquadragintillion","sexquadragintillion",
					"septquadragintillion", "octoquadragintillion", "novemquadragintillion",
		"quinquagintillion", "unquinquagintillion", "duoquinquagintillion", "trequinquagintillion", "quattoquinquagintillion", "quintquinquagintillion", "sexquinquagintillion",
					"septquinquagintillion", "octoquinquagintillion", "novemquinquagintillion", 
		"sexagintillion", "unsexagintillion", "duosexagintillion", "tresexagintillion", "quattosexagintillion", "quintsexagintillion", "sexsexagintillion",
					"septsexagintillion", "octosexagintillion", "novemsexagintillion",
		"septuagintillion", "unseptuagintillion", "duoseptuagintillion", "treseptuagintillion", "quattoseptuagintillion", "quintseptuagintillion", "sexseptuagintillion",
					"septseptuagintillion", "octoseptuagintillion", "novemseptuagintillion",
		"octogintillion", "unoctogintillion", "duooctogintillion", "treoctogintillion", "quattooctogintillion", "quintoctogintillion", "sexoctogintillion",
					"septoctogintillion", "octooctogintillion", "novemoctogintillion",
		"nonagintillion", "unnonagintillion", "duononagintillion", "trenonagintillion", "quattononagintillion", "quintnonagintillion", "sexnonagintillion",
					"septnonagintillion", "octononagintillion", "novemnonagintillion", 
		"centillion", "uncentillion", "duocentillion", "trescentillion", "quattuorcentillion", "quintcentillion", "sexcentillion", "septcentillion", 
						"octocentillion", "novemcentillion", 
		"decicentillion", "undecicentillion", "duodecicentillion", "tredecicentillion", "quattuordecicentillion", "quintdecicentillion", 
						"sexdecicentillion", "septdecicentillion", "octodecicentillion", "novemdecicentillion",
		"viginticentillion", "unviginticentillion", "duoviginticentillion", "treviginticentillion", "quattuorviginticentillion", "quintviginticentillion", 
						"sexviginticentillion", "septviginticentillion", "octoviginticentillion", "novemviginticentillion", 
		"trigintacentillion", "untrigintacentillion", "duotrigintacentillion", "tretrigintacentillion", "quattuortrigintacentillion", "quinttrigintacentillion", 
						"sextrigintacentillion", "septtrigintacentillion", "octotrigintacentillion", "novemtrigintacentillion",
		"quadragintacentillion", "unquadragintacentillion", "duoquadragintacentillion", "trequadragintacentillion", "quattuorquadragintacentillion", 
						"quintquadragintacentillion", "sexquadragintacentillion", "septquadragintacentillion", "octoquadragintacentillion", "novemquadragintacentillion",
		"quinquagintacentillion", "unquinquagintacentillion", "duoquinquagintacentillion", "trequinquagintacentillion", "quattuorquinquagintacentillion",
						"quintquinquagintacentillion", "sexquinquagintacentillion", "septquinquagintacentillion", "octoquinquagintacentillion", "novemquinquagintacentillion", 
		"sexagintacentillion", "unsexagintacentillion", "duosexagintacentillion", "tresexagintacentillion", "quattoursexagintacentillion", "quintsexagintacentillion", 
						"sexsexagintacentillion", "septsexagintacentillion", "octosexagintacentillion", "novemsexagintacentillion", 
		"septuagintacentillion", "unseptuagintacentillion", "duoseptuagintacentillion", "treseptuagintacentillion", "quattrouseptuagintacentillion", 
						"quintseptuagintacentillion", "sexseptuagintacentillion", "septseptuagintacentillion", "octoseptuagintacentillion", "novemseptuagintacentillion", 
		"octogintacentillion", "unoctogintacentillion", "duooctogintacentillion", "treoctogintacentillion", "quattuoroctogintacentillion", "quintoctogintacentillion", 
						"sexoctogintacentillion", "septoctogintacentillion", "octooctogintacentillion", "novemoctogintacentillion", 
		"nonagintacentillion", "unnonagintacentillion", "duononagintacentillion", "trenonagintacentillion", "quattrounonagintacentillion", "quintnonagintacentillion", 
						"sexnonagintacentillion", "septnonagintacentillion", "octononagintacentillion", "novemnonagintacentillion", 
						
						"ducentillion", "unducentillion", "duoducentillion", "tresducentillion", "quattuorducentillion", "quinquaducentillion", "sesducentillion", "septenducentillion", "octoducentillion", "novenducentillion", 
						"undeciducentillion", "duodeciducentillion", "tresdeciducentillion", "quattuordeciducentillion", "quinquadeciducentillion", "sesdeciducentillion", "septendeciducentillion", "octodeciducentillion", "novendeciducentillion", 
						"unvigintiducentillion", "duovigintiducentillion", "tresvigintiducentillion", "quattuorvigintiducentillion", "quinquavigintiducentillion", "sesvigintiducentillion", "septenvigintiducentillion", "octovigintiducentillion", "novenvigintiducentillion", 
						"untrigintaducentillion", "duotrigintaducentillion", "trestrigintaducentillion", "quattuortrigintaducentillion", "quinquatrigintaducentillion", "sestrigintaducentillion", "septentrigintaducentillion", "octotrigintaducentillion", "noventrigintaducentillion", 
						"unquadragintaducentillion", "duoquadragintaducentillion", "tresquadragintaducentillion", "quattuorquadragintaducentillion", "quinquaquadragintaducentillion", "sesquadragintaducentillion", "septenquadragintaducentillion", "octoquadragintaducentillion", "novenquadragintaducentillion", 
						"unquinquagintaducentillion", "duoquinquagintaducentillion", "tresquinquagintaducentillion", "quattuorquinquagintaducentillion", "quinquaquinquagintaducentillion", "sesquinquagintaducentillion", "septenquinquagintaducentillion", "octoquinquagintaducentillion", "novenquinquagintaducentillion", 
						"unsexagintaducentillion", "duosexagintaducentillion", "tressexagintaducentillion", "quattuorsexagintaducentillion", "quinquasexagintaducentillion", "sessexagintaducentillion", "septensexagintaducentillion", "octosexagintaducentillion", "novensexagintaducentillion", 
						"unseptuagintaducentillion", "duoseptuagintaducentillion", "tresseptuagintaducentillion", "quattuorseptuagintaducentillion", "quinquaseptuagintaducentillion", "sesseptuagintaducentillion", "septenseptuagintaducentillion", "octoseptuagintaducentillion", "novenseptuagintaducentillion", 
						"unoctogintaducentillion", "duooctogintaducentillion", "tresoctogintaducentillion", "quattuoroctogintaducentillion", "quinquaoctogintaducentillion", "sesoctogintaducentillion", "septenoctogintaducentillion", "octooctogintaducentillion", "novenoctogintaducentillion", 
						"unnonagintaducentillion", "duononagintaducentillion", "tresnonagintaducentillion", "quattuornonagintaducentillion", "quinquanonagintaducentillion", "sesnonagintaducentillion", "septennonagintaducentillion", "octononagintaducentillion", "novennonagintaducentillion", 

						"trecentillion", "untrecentillion", "duotrecentillion", "trestrecentillion", "quattuortrecentillion", "quinquatrecentillion", "sestrecentillion", "septentrecentillion", "octotrecentillion", "noventrecentillion", 
						"undecitrecentillion", "duodecitrecentillion", "tresdecitrecentillion", "quattuordecitrecentillion", "quinquadecitrecentillion", "sesdecitrecentillion", "septendecitrecentillion", "octodecitrecentillion", "novendecitrecentillion", 
						"unvigintitrecentillion", "duovigintitrecentillion", "tresvigintitrecentillion", "quattuorvigintitrecentillion", "quinquavigintitrecentillion", "sesvigintitrecentillion", "septenvigintitrecentillion", "octovigintitrecentillion", "novenvigintitrecentillion", 
						"untrigintatrecentillion", "duotrigintatrecentillion", "trestrigintatrecentillion", "quattuortrigintatrecentillion", "quinquatrigintatrecentillion", "sestrigintatrecentillion", "septentrigintatrecentillion", "octotrigintatrecentillion", "noventrigintatrecentillion", 
						"unquadragintatrecentillion", "duoquadragintatrecentillion", "tresquadragintatrecentillion", "quattuorquadragintatrecentillion", "quinquaquadragintatrecentillion", "sesquadragintatrecentillion", "septenquadragintatrecentillion", "octoquadragintatrecentillion", "novenquadragintatrecentillion", 
						"unquinquagintatrecentillion", "duoquinquagintatrecentillion", "tresquinquagintatrecentillion", "quattuorquinquagintatrecentillion", "quinquaquinquagintatrecentillion", "sesquinquagintatrecentillion", "septenquinquagintatrecentillion", "octoquinquagintatrecentillion", "novenquinquagintatrecentillion", 
						"unsexagintatrecentillion", "duosexagintatrecentillion", "tressexagintatrecentillion", "quattuorsexagintatrecentillion", "quinquasexagintatrecentillion", "sessexagintatrecentillion", "septensexagintatrecentillion", "octosexagintatrecentillion", "novensexagintatrecentillion", 
						"unseptuagintatrecentillion", "duoseptuagintatrecentillion", "tresseptuagintatrecentillion", "quattuorseptuagintatrecentillion", "quinquaseptuagintatrecentillion", "sesseptuagintatrecentillion", "septenseptuagintatrecentillion", "octoseptuagintatrecentillion", "novenseptuagintatrecentillion", 
						"unoctogintatrecentillion", "duooctogintatrecentillion", "tresoctogintatrecentillion", "quattuoroctogintatrecentillion", "quinquaoctogintatrecentillion", "sesoctogintatrecentillion", "septenoctogintatrecentillion", "octooctogintatrecentillion", "novenoctogintatrecentillion", 
						"unnonagintatrecentillion", "duononagintatrecentillion", "tresnonagintatrecentillion", "quattuornonagintatrecentillion", "quinquanonagintatrecentillion", "sesnonagintatrecentillion", "septennonagintatrecentillion", "octononagintatrecentillion", "novennonagintatrecentillion", 

						"quadringentillion", "unquadringentillion", "duoquadringentillion", "tresquadringentillion", "quattuorquadringentillion", "quinquaquadringentillion", "sesquadringentillion", "septenquadringentillion", "octoquadringentillion", "novenquadringentillion", 
						"undeciquadringentillion", "duodeciquadringentillion", "tresdeciquadringentillion", "quattuordeciquadringentillion", "quinquadeciquadringentillion", "sesdeciquadringentillion", "septendeciquadringentillion", "octodeciquadringentillion", "novendeciquadringentillion", 
						"unvigintiquadringentillion", "duovigintiquadringentillion", "tresvigintiquadringentillion", "quattuorvigintiquadringentillion", "quinquavigintiquadringentillion", "sesvigintiquadringentillion", "septenvigintiquadringentillion", "octovigintiquadringentillion", "novenvigintiquadringentillion", 
						"untrigintaquadringentillion", "duotrigintaquadringentillion", "trestrigintaquadringentillion", "quattuortrigintaquadringentillion", "quinquatrigintaquadringentillion", "sestrigintaquadringentillion", "septentrigintaquadringentillion", "octotrigintaquadringentillion", "noventrigintaquadringentillion", 
						"unquadragintaquadringentillion", "duoquadragintaquadringentillion", "tresquadragintaquadringentillion", "quattuorquadragintaquadringentillion", "quinquaquadragintaquadringentillion", "sesquadragintaquadringentillion", "septenquadragintaquadringentillion", "octoquadragintaquadringentillion", "novenquadragintaquadringentillion", 
						"unquinquagintaquadringentillion", "duoquinquagintaquadringentillion", "tresquinquagintaquadringentillion", "quattuorquinquagintaquadringentillion", "quinquaquinquagintaquadringentillion", "sesquinquagintaquadringentillion", "septenquinquagintaquadringentillion", "octoquinquagintaquadringentillion", "novenquinquagintaquadringentillion", 
						"unsexagintaquadringentillion", "duosexagintaquadringentillion", "tressexagintaquadringentillion", "quattuorsexagintaquadringentillion", "quinquasexagintaquadringentillion", "sessexagintaquadringentillion", "septensexagintaquadringentillion", "octosexagintaquadringentillion", "novensexagintaquadringentillion", 
						"unseptuagintaquadringentillion", "duoseptuagintaquadringentillion", "tresseptuagintaquadringentillion", "quattuorseptuagintaquadringentillion", "quinquaseptuagintaquadringentillion", "sesseptuagintaquadringentillion", "septenseptuagintaquadringentillion", "octoseptuagintaquadringentillion", "novenseptuagintaquadringentillion", 
						"unoctogintaquadringentillion", "duooctogintaquadringentillion", "tresoctogintaquadringentillion", "quattuoroctogintaquadringentillion", "quinquaoctogintaquadringentillion", "sesoctogintaquadringentillion", "septenoctogintaquadringentillion", "octooctogintaquadringentillion", "novenoctogintaquadringentillion", 
						"unnonagintaquadringentillion", "duononagintaquadringentillion", "tresnonagintaquadringentillion", "quattuornonagintaquadringentillion", "quinquanonagintaquadringentillion", "sesnonagintaquadringentillion", "septennonagintaquadringentillion", "octononagintaquadringentillion", "novennonagintaquadringentillion", 

						"quingentillion", "unquingentillion", "duoquingentillion", "tresquingentillion", "quattuorquingentillion", "quinquaquingentillion", "sesquingentillion", "septenquingentillion", "octoquingentillion", "novenquingentillion", 
						"undeciquingentillion", "duodeciquingentillion", "tresdeciquingentillion", "quattuordeciquingentillion", "quinquadeciquingentillion", "sesdeciquingentillion", "septendeciquingentillion", "octodeciquingentillion", "novendeciquingentillion", 
						"unvigintiquingentillion", "duovigintiquingentillion", "tresvigintiquingentillion", "quattuorvigintiquingentillion", "quinquavigintiquingentillion", "sesvigintiquingentillion", "septenvigintiquingentillion", "octovigintiquingentillion", "novenvigintiquingentillion", 
						"untrigintaquingentillion", "duotrigintaquingentillion", "trestrigintaquingentillion", "quattuortrigintaquingentillion", "quinquatrigintaquingentillion", "sestrigintaquingentillion", "septentrigintaquingentillion", "octotrigintaquingentillion", "noventrigintaquingentillion", 
						"unquadragintaquingentillion", "duoquadragintaquingentillion", "tresquadragintaquingentillion", "quattuorquadragintaquingentillion", "quinquaquadragintaquingentillion", "sesquadragintaquingentillion", "septenquadragintaquingentillion", "octoquadragintaquingentillion", "novenquadragintaquingentillion", 
						"unquinquagintaquingentillion", "duoquinquagintaquingentillion", "tresquinquagintaquingentillion", "quattuorquinquagintaquingentillion", "quinquaquinquagintaquingentillion", "sesquinquagintaquingentillion", "septenquinquagintaquingentillion", "octoquinquagintaquingentillion", "novenquinquagintaquingentillion", 
						"unsexagintaquingentillion", "duosexagintaquingentillion", "tressexagintaquingentillion", "quattuorsexagintaquingentillion", "quinquasexagintaquingentillion", "sessexagintaquingentillion", "septensexagintaquingentillion", "octosexagintaquingentillion", "novensexagintaquingentillion", 
						"unseptuagintaquingentillion", "duoseptuagintaquingentillion", "tresseptuagintaquingentillion", "quattuorseptuagintaquingentillion", "quinquaseptuagintaquingentillion", "sesseptuagintaquingentillion", "septenseptuagintaquingentillion", "octoseptuagintaquingentillion", "novenseptuagintaquingentillion", 
						"unoctogintaquingentillion", "duooctogintaquingentillion", "tresoctogintaquingentillion", "quattuoroctogintaquingentillion", "quinquaoctogintaquingentillion", "sesoctogintaquingentillion", "septenoctogintaquingentillion", "octooctogintaquingentillion", "novenoctogintaquingentillion", 
						"unnonagintaquingentillion", "duononagintaquingentillion", "tresnonagintaquingentillion", "quattuornonagintaquingentillion", "quinquanonagintaquingentillion", "sesnonagintaquingentillion", "septennonagintaquingentillion", "octononagintaquingentillion", "novennonagintaquingentillion", 

						"sescentillion", "unsescentillion", "duosescentillion", "tressescentillion", "quattuorsescentillion", "quinquasescentillion", "sessescentillion", "septensescentillion", "octosescentillion", "novensescentillion", 
						"undecisescentillion", "duodecisescentillion", "tresdecisescentillion", "quattuordecisescentillion", "quinquadecisescentillion", "sesdecisescentillion", "septendecisescentillion", "octodecisescentillion", "novendecisescentillion", 
						"unvigintisescentillion", "duovigintisescentillion", "tresvigintisescentillion", "quattuorvigintisescentillion", "quinquavigintisescentillion", "sesvigintisescentillion", "septenvigintisescentillion", "octovigintisescentillion", "novenvigintisescentillion", 
						"untrigintasescentillion", "duotrigintasescentillion", "trestrigintasescentillion", "quattuortrigintasescentillion", "quinquatrigintasescentillion", "sestrigintasescentillion", "septentrigintasescentillion", "octotrigintasescentillion", "noventrigintasescentillion", 
						"unquadragintasescentillion", "duoquadragintasescentillion", "tresquadragintasescentillion", "quattuorquadragintasescentillion", "quinquaquadragintasescentillion", "sesquadragintasescentillion", "septenquadragintasescentillion", "octoquadragintasescentillion", "novenquadragintasescentillion", 
						"unquinquagintasescentillion", "duoquinquagintasescentillion", "tresquinquagintasescentillion", "quattuorquinquagintasescentillion", "quinquaquinquagintasescentillion", "sesquinquagintasescentillion", "septenquinquagintasescentillion", "octoquinquagintasescentillion", "novenquinquagintasescentillion", 
						"unsexagintasescentillion", "duosexagintasescentillion", "tressexagintasescentillion", "quattuorsexagintasescentillion", "quinquasexagintasescentillion", "sessexagintasescentillion", "septensexagintasescentillion", "octosexagintasescentillion", "novensexagintasescentillion", 
						"unseptuagintasescentillion", "duoseptuagintasescentillion", "tresseptuagintasescentillion", "quattuorseptuagintasescentillion", "quinquaseptuagintasescentillion", "sesseptuagintasescentillion", "septenseptuagintasescentillion", "octoseptuagintasescentillion", "novenseptuagintasescentillion", 
						"unoctogintasescentillion", "duooctogintasescentillion", "tresoctogintasescentillion", "quattuoroctogintasescentillion", "quinquaoctogintasescentillion", "sesoctogintasescentillion", "septenoctogintasescentillion", "octooctogintasescentillion", "novenoctogintasescentillion", 
						"unnonagintasescentillion", "duononagintasescentillion", "tresnonagintasescentillion", "quattuornonagintasescentillion", "quinquanonagintasescentillion", "sesnonagintasescentillion", "septennonagintasescentillion", "octononagintasescentillion", "novennonagintasescentillion", 

						"septingentillion", "unseptingentillion", "duoseptingentillion", "tresseptingentillion", "quattuorseptingentillion", "quinquaseptingentillion", "sesseptingentillion", "septenseptingentillion", "octoseptingentillion", "novenseptingentillion", 
						"undeciseptingentillion", "duodeciseptingentillion", "tresdeciseptingentillion", "quattuordeciseptingentillion", "quinquadeciseptingentillion", "sesdeciseptingentillion", "septendeciseptingentillion", "octodeciseptingentillion", "novendeciseptingentillion", 
						"unvigintiseptingentillion", "duovigintiseptingentillion", "tresvigintiseptingentillion", "quattuorvigintiseptingentillion", "quinquavigintiseptingentillion", "sesvigintiseptingentillion", "septenvigintiseptingentillion", "octovigintiseptingentillion", "novenvigintiseptingentillion", 
						"untrigintaseptingentillion", "duotrigintaseptingentillion", "trestrigintaseptingentillion", "quattuortrigintaseptingentillion", "quinquatrigintaseptingentillion", "sestrigintaseptingentillion", "septentrigintaseptingentillion", "octotrigintaseptingentillion", "noventrigintaseptingentillion", 
						"unquadragintaseptingentillion", "duoquadragintaseptingentillion", "tresquadragintaseptingentillion", "quattuorquadragintaseptingentillion", "quinquaquadragintaseptingentillion", "sesquadragintaseptingentillion", "septenquadragintaseptingentillion", "octoquadragintaseptingentillion", "novenquadragintaseptingentillion", 
						"unquinquagintaseptingentillion", "duoquinquagintaseptingentillion", "tresquinquagintaseptingentillion", "quattuorquinquagintaseptingentillion", "quinquaquinquagintaseptingentillion", "sesquinquagintaseptingentillion", "septenquinquagintaseptingentillion", "octoquinquagintaseptingentillion", "novenquinquagintaseptingentillion", 
						"unsexagintaseptingentillion", "duosexagintaseptingentillion", "tressexagintaseptingentillion", "quattuorsexagintaseptingentillion", "quinquasexagintaseptingentillion", "sessexagintaseptingentillion", "septensexagintaseptingentillion", "octosexagintaseptingentillion", "novensexagintaseptingentillion", 
						"unseptuagintaseptingentillion", "duoseptuagintaseptingentillion", "tresseptuagintaseptingentillion", "quattuorseptuagintaseptingentillion", "quinquaseptuagintaseptingentillion", "sesseptuagintaseptingentillion", "septenseptuagintaseptingentillion", "octoseptuagintaseptingentillion", "novenseptuagintaseptingentillion", 
						"unoctogintaseptingentillion", "duooctogintaseptingentillion", "tresoctogintaseptingentillion", "quattuoroctogintaseptingentillion", "quinquaoctogintaseptingentillion", "sesoctogintaseptingentillion", "septenoctogintaseptingentillion", "octooctogintaseptingentillion", "novenoctogintaseptingentillion", 
						"unnonagintaseptingentillion", "duononagintaseptingentillion", "tresnonagintaseptingentillion", "quattuornonagintaseptingentillion", "quinquanonagintaseptingentillion", "sesnonagintaseptingentillion", "septennonagintaseptingentillion", "octononagintaseptingentillion", "novennonagintaseptingentillion", 

						"octingentillion", "unoctingentillion", "duooctingentillion", "tresoctingentillion", "quattuoroctingentillion", "quinquaoctingentillion", "sesoctingentillion", "septenoctingentillion", "octooctingentillion", "novenoctingentillion", 
						"undecioctingentillion", "duodecioctingentillion", "tresdecioctingentillion", "quattuordecioctingentillion", "quinquadecioctingentillion", "sesdecioctingentillion", "septendecioctingentillion", "octodecioctingentillion", "novendecioctingentillion", 
						"unvigintioctingentillion", "duovigintioctingentillion", "tresvigintioctingentillion", "quattuorvigintioctingentillion", "quinquavigintioctingentillion", "sesvigintioctingentillion", "septenvigintioctingentillion", "octovigintioctingentillion", "novenvigintioctingentillion", 
						"untrigintaoctingentillion", "duotrigintaoctingentillion", "trestrigintaoctingentillion", "quattuortrigintaoctingentillion", "quinquatrigintaoctingentillion", "sestrigintaoctingentillion", "septentrigintaoctingentillion", "octotrigintaoctingentillion", "noventrigintaoctingentillion", 
						"unquadragintaoctingentillion", "duoquadragintaoctingentillion", "tresquadragintaoctingentillion", "quattuorquadragintaoctingentillion", "quinquaquadragintaoctingentillion", "sesquadragintaoctingentillion", "septenquadragintaoctingentillion", "octoquadragintaoctingentillion", "novenquadragintaoctingentillion", 
						"unquinquagintaoctingentillion", "duoquinquagintaoctingentillion", "tresquinquagintaoctingentillion", "quattuorquinquagintaoctingentillion", "quinquaquinquagintaoctingentillion", "sesquinquagintaoctingentillion", "septenquinquagintaoctingentillion", "octoquinquagintaoctingentillion", "novenquinquagintaoctingentillion", 
						"unsexagintaoctingentillion", "duosexagintaoctingentillion", "tressexagintaoctingentillion", "quattuorsexagintaoctingentillion", "quinquasexagintaoctingentillion", "sessexagintaoctingentillion", "septensexagintaoctingentillion", "octosexagintaoctingentillion", "novensexagintaoctingentillion", 
						"unseptuagintaoctingentillion", "duoseptuagintaoctingentillion", "tresseptuagintaoctingentillion", "quattuorseptuagintaoctingentillion", "quinquaseptuagintaoctingentillion", "sesseptuagintaoctingentillion", "septenseptuagintaoctingentillion", "octoseptuagintaoctingentillion", "novenseptuagintaoctingentillion", 
						"unoctogintaoctingentillion", "duooctogintaoctingentillion", "tresoctogintaoctingentillion", "quattuoroctogintaoctingentillion", "quinquaoctogintaoctingentillion", "sesoctogintaoctingentillion", "septenoctogintaoctingentillion", "octooctogintaoctingentillion", "novenoctogintaoctingentillion", 
						"unnonagintaoctingentillion", "duononagintaoctingentillion", "tresnonagintaoctingentillion", "quattuornonagintaoctingentillion", "quinquanonagintaoctingentillion", "sesnonagintaoctingentillion", "septennonagintaoctingentillion", "octononagintaoctingentillion", "novennonagintaoctingentillion", 

						"nongentillion", "unnongentillion", "duonongentillion", "tresnongentillion", "quattuornongentillion", "quinquanongentillion", "sesnongentillion", "septennongentillion", "octonongentillion", "novennongentillion", 
						"undecinongentillion", "duodecinongentillion", "tresdecinongentillion", "quattuordecinongentillion", "quinquadecinongentillion", "sesdecinongentillion", "septendecinongentillion", "octodecinongentillion", "novendecinongentillion", 
						"unvigintinongentillion", "duovigintinongentillion", "tresvigintinongentillion", "quattuorvigintinongentillion", "quinquavigintinongentillion", "sesvigintinongentillion", "septenvigintinongentillion", "octovigintinongentillion", "novenvigintinongentillion", 
						"untrigintanongentillion", "duotrigintanongentillion", "trestrigintanongentillion", "quattuortrigintanongentillion", "quinquatrigintanongentillion", "sestrigintanongentillion", "septentrigintanongentillion", "octotrigintanongentillion", "noventrigintanongentillion", 
						"unquadragintanongentillion", "duoquadragintanongentillion", "tresquadragintanongentillion", "quattuorquadragintanongentillion", "quinquaquadragintanongentillion", "sesquadragintanongentillion", "septenquadragintanongentillion", "octoquadragintanongentillion", "novenquadragintanongentillion", 
						"unquinquagintanongentillion", "duoquinquagintanongentillion", "tresquinquagintanongentillion", "quattuorquinquagintanongentillion", "quinquaquinquagintanongentillion", "sesquinquagintanongentillion", "septenquinquagintanongentillion", "octoquinquagintanongentillion", "novenquinquagintanongentillion", 
						"unsexagintanongentillion", "duosexagintanongentillion", "tressexagintanongentillion", "quattuorsexagintanongentillion", "quinquasexagintanongentillion", "sessexagintanongentillion", "septensexagintanongentillion", "octosexagintanongentillion", "novensexagintanongentillion", 
						"unseptuagintanongentillion", "duoseptuagintanongentillion", "tresseptuagintanongentillion", "quattuorseptuagintanongentillion", "quinquaseptuagintanongentillion", "sesseptuagintanongentillion", "septenseptuagintanongentillion", "octoseptuagintanongentillion", "novenseptuagintanongentillion", 
						"unoctogintanongentillion", "duooctogintanongentillion", "tresoctogintanongentillion", "quattuoroctogintanongentillion", "quinquaoctogintanongentillion", "sesoctogintanongentillion", "septenoctogintanongentillion", "octooctogintanongentillion", "novenoctogintanongentillion", 
						"unnonagintanongentillion", "duononagintanongentillion", "tresnonagintanongentillion", "quattuornonagintanongentillion", "quinquanonagintanongentillion", "sesnonagintanongentillion", "septennonagintanongentillion", "octononagintanongentillion", "novennonagintanongentillion", 
						"millinillion"
};
}
